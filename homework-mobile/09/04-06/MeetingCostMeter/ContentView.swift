//
//  ContentView.swift
//  MeetingCostMeter
//
//  Created by Matias Yliluoma on 20.4.2023.
//

import SwiftUI

/*
struct UserInput: View {
    @State var numb1 = 0
    var input = ""
    var input2 = ""
    
    
    var body : some View {
        VStack {
            HStack {
                Text($input)
                TextField("n1", value: $numb1, placeholder: NumberFormatter()).textFieldStyle(RoundedBorderTextFieldStyle())
            }.padding(.leading).padding(.trailing, 20)
        }
    }
}*/

struct ContentView: View {
    @State var sum = 0
    @State var num1 = 0
    @State var num2 = 0

 
 var body : some View {
     VStack {
         Spacer()
         Text("Calculator")
             .font(
             .custom("Chalkduster",
             fixedSize: 40)
             .weight(.black)
             )
         Spacer()
         HStack {
             Text("Number1:")
             TextField("n1", value: $num1, formatter: NumberFormatter()).textFieldStyle(RoundedBorderTextFieldStyle())
            }.padding(.leading).padding(.trailing, 20)
            HStack {
                Text("Number2:")
                TextField("n2", value: $num2, formatter: NumberFormatter()).textFieldStyle(RoundedBorderTextFieldStyle())
            }.padding(.leading).padding(.trailing, 20)
            
            Button(action : {
                	sum = num1 + num2
            }) {
                Text("Calculate")
                    .padding()
                    .background(.purple)
                    .foregroundColor(.white)
                    .font(.largeTitle)
                    .padding()
            }
            Text("Sum is = \(sum)")
            Spacer()
            
        }
    }
}


 struct ContentView_Previews: PreviewProvider {
     static var previews: some View {
         ContentView()
     }
 }


