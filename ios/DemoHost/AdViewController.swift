//
//  AdViewController.swift
//  Plays the role of the publisher: it creates the banner, becomes its
//  delegate, and asks it to load an ad. It also demonstrates that the
//  Objective-C SDK API is clean to consume from Swift.
//

import UIKit
import AdBannerKit

final class AdViewController: UIViewController, AdBannerViewDelegate {

    private var banner: AdBannerView?

    override func viewDidLoad() {
        super.viewDidLoad()
        view.backgroundColor = .systemBackground
        title = "Publisher App"

        let banner = AdBannerView(size: CGSize(width: 320, height: 50))
        banner.delegate = self
        banner.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(banner)
        NSLayoutConstraint.activate([
            banner.centerXAnchor.constraint(equalTo: view.centerXAnchor),
            banner.centerYAnchor.constraint(equalTo: view.centerYAnchor),
            banner.widthAnchor.constraint(equalToConstant: 320),
            banner.heightAnchor.constraint(equalToConstant: 50),
        ])
        self.banner = banner

        // Load sample markup. Swap in a bad/never-resolving URL to exercise the
        // failure/timeout path.
        banner.load(withMarkup: AdKitSupport.sampleMarkup)
    }

    // MARK: - AdBannerViewDelegate

    func adBannerViewDidLoad(_ bannerView: AdBannerView) {
        print("✅ adBannerViewDidLoad")
    }

    func adBannerView(_ bannerView: AdBannerView, didFailWithError error: Error) {
        print("❌ adBannerView didFailWithError: \(error.localizedDescription)")
    }

    func adBannerViewDidTrackImpression(_ bannerView: AdBannerView) {
        print("👁  adBannerViewDidTrackImpression")
    }

    func adBannerViewDidTrackClick(_ bannerView: AdBannerView) {
        print("👆 adBannerViewDidTrackClick")
    }
}
