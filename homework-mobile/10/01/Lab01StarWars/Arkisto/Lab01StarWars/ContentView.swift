//
//  ContentView.swift
//  Lab01StarWars
//
//  Created by Matias Yliluoma on 27.4.2023.
//

import SwiftUI


struct HttpResult : Decodable {
    let results : Array<Person>
    
}

struct Person : Decodable {
    let name : String
    
}


// Dummy nappi (Testausta varten!)
//   Ota yhteys backendiin
//     json parsinta
//       UI:n säätämistä


struct ContentView: View {
    
    @State var names : [Person] = nil?
    
    var body: some View {
         // 1 ota yhteys backendiin
        let myURL = URL(string: "https://swapi.dev/api/people/")!
        let httpTask = URLSession.shared.dataTask(with: myURL) {
            (optionalData, response, error) in
                             
            do {
                let jsonDecoder = JSONDecoder()
                let httpResult : HttpResult = try jsonDecoder.decode(HttpResult.self, from: optionalData!)
                print(httpResult.results[0].name)
                
                VStack {
                    List {
                        ForEach(name: \.self) {
                            Text(httpResult.results[].name)
                        }
                    }
                }
            } catch {
                print(error)
            }
        }
            httpTask.resume()
            ProgressView()
        
        
        
    }
}
/*
struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}*/


/*
 
 let json : Data = """
 [{
     "name": "name"
 }]
 """.data(using: .utf8)!
 let myURL = URL(string: "https://swapi.dev/api/people/")!
 let httpTask = URLSession.shared.dataTask(with: myURL) {
     (optionalData, response, error) in
     let data : String = String(data: optionalData!, encoding: .utf8)!
     print(data)
     
     do {
         let jsonDecoder = JSONDecoder()
         let names : results = try jsonDecoder.decode(HttpResult.self, from: json)
         
     } catch {
         print(error)
     }
     
 }
     httpTask.resume()
 
 */
