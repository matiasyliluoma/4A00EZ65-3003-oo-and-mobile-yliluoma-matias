//
//  MeetingCostMeterApp.swift
//  MeetingCostMeter
//
//  Created by Matias Yliluoma on 20.4.2023.
//

import SwiftUI

class MyAppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions
        launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        print("Application started!")
        return true
    }
    
    func applicationWillTerminate(_ application: UIApplication) {
        print("terminated")
    }
}

@main
struct MeetingCostMeterApp: App {    
    @Environment(\.scenePhase) private var scenePhase
    @UIApplicationDelegateAdaptor(MyAppDelegate.self) var appDelegate
        
        var body: some Scene {
            WindowGroup {
                ContentView()
            }
            .onChange(of: scenePhase) { newPhase in
                print(newPhase) // background, active, inactive...
                // or NSLog(String(describing: newPhase))
        }
    }
}
