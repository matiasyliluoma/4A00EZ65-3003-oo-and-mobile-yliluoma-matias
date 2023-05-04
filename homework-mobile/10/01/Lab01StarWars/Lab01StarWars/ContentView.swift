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

struct Person : Decodable, Hashable {
    let name : String
    
}

struct ContentView: View {
    
    @State var persons : [Person] = []
    
    var body: some View {
        
        
        NavigationView {
            VStack {
                if($persons.isEmpty) {
                    ProgressView()
                }
                List {
                    ForEach($persons, id: \.self) { $person in
                        Text(person.name)
                    }
                }.listStyle(GroupedListStyle())
            }.onAppear {
                fetchPersons()
            }.navigationTitle("Star Wars API")
        }
    }
    
    func fetchPersons() {
        let myURL = URL(string: "https://swapi.dev/api/people/")!
        let httpTask = URLSession.shared.dataTask(with: myURL) {
            (optionalData, response, error) in
            
            
            DispatchQueue.main.async {
                do {
                    let jsonDecoder = JSONDecoder()
                    let httpResult : HttpResult = try jsonDecoder.decode(HttpResult.self, from: optionalData!)
                    persons = httpResult.results
                                        
                } catch {
                    print(error)
                }
            }
            
        }
        httpTask.resume()
    }
}
/*
struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}*/

