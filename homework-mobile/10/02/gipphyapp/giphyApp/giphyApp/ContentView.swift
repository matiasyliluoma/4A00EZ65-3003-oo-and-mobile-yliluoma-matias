//
//  ContentView.swift
//  giphyApp
//
//  Created by Matias Yliluoma on 2.5.2023.
//
/*
 https://makeschool.org/mediabook/oa/tutorials/giphy-search-for-ios-hrs/creating-the-gif-object/
*/
import AVKit
import SwiftUI
import Alamofire

struct GetData : Decodable {
    var data : Array<DataArray>
}

struct DataArray : Decodable {
    let id : String
}

struct ContentView: View {
   @State var players : Array<AVPlayer> = []
   @State var gifInput : String = ""
   // @State var gifID : String? = ""
   // var mediaUrl : String = "https://i.giphy.com/media/\()/giphy.mp4"
    
    var body: some View {
        ScrollView {
            VStack {
                HStack {
                    TextField("Type something..", text: $gifInput)
                    Button("Search") {
                        fetchGifs(gifInput: self.gifInput)
                    }.frame(alignment: .center)
                }
                
                ForEach($players, id: \.self) { $player in
                    VideoPlayer(player: player)
                        .frame(width: UIScreen.main.bounds.width, height: 200)
                }
                
            }
        }
        
        .padding()
    }
    
    func fetchGifs(gifInput: String) {
     //   var searchThis : TextField? = TextField("Type something..", text: $gifInput)
      //  var searchThis : String = "cat"
        let KEY = "H7ZKv9TMcapSexQhXnPv2ow1f9NVmd1y"
        let myUrl =  "https://api.giphy.com/v1/gifs/search?api_key=\(KEY)&q=\(gifInput)&limit=25&offset=0&rating=g&lang=en"
        
        let request = AF.request(myUrl)
        
        request.responseDecodable(of: GetData.self) { response in
            print("matias \(response.value?.data)")
            
            let datas = response.value?.data
            var playerArray : Array<AVPlayer> = []
            for data in datas! {
                let id = data.id
                
                if id == nil {
                    print("data")
                    return
                }
                
                let mediaUrl = URL(string: "https://i.giphy.com/media/\(id)/giphy.mp4")
                
                if let unwrapped = mediaUrl {
                    let gifPlayer = AVPlayer(url: unwrapped)
                    playerArray.append(gifPlayer)
                }
            }
            
            players += playerArray
        }
        players.removeAll()
    }
}


/*
struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}*/
