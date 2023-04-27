//
//  ContentView.swift
//  MeetingCostMeter
//
//  Created by Matias Yliluoma on 20.4.2023.
//

import SwiftUI

/*
 func f() -> TupleView<(Text, Text)> {
     let content : TupleView<(Text, Text)>
                            = TupleView<(Text,Text)>((Text("moi"), Text("hei")))
     return content
 }
 */


struct ContentView: View {
  //  var body : Text = Text("Hello World")
    
    /*
     var body = VStack(content: {
         Text("moi")
         Text("Hei")
     })
     */
    
    var body : some View {
        VStack {
            
            Text("moi")
            Text("hei")
            Button(action: {},
                   label:  { Text("Calculate BMI") } )
        }
    }
}


 struct ContentView_Previews: PreviewProvider {
     static var previews: some View {
         ContentView()
     }
 }


