//
//  AppDelegate.swift
//  Minimal host app (no storyboards, no scenes) so the focus stays on the SDK.
//

import UIKit

@main
final class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?

    func application(_ application: UIApplication,
                     didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]? = nil) -> Bool {
        let window = UIWindow(frame: UIScreen.main.bounds)
        window.rootViewController = UINavigationController(rootViewController: AdViewController())
        window.makeKeyAndVisible()
        self.window = window
        return true
    }
}
