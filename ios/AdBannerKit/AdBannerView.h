//
//  AdBannerView.h
//  Publisher-facing API (Objective-C). This is the contract a publisher app
//  integrates against. Keep this surface clean and Objective-C-safe.
//
//  Modeled on the production HyBidAdView / HyBidAdViewDelegate.
//

#import <UIKit/UIKit.h>

@class AdBannerView;

NS_ASSUME_NONNULL_BEGIN

/// Lifecycle callbacks delivered to the publisher.
/// Note: the SDK holds this delegate *weakly* — it must never retain the host.
@protocol AdBannerViewDelegate <NSObject>

/// The ad finished rendering and is ready to be shown.
- (void)adBannerViewDidLoad:(AdBannerView *)bannerView;

/// The ad failed to load. `error` describes why (e.g. timeout, render failure).
- (void)adBannerView:(AdBannerView *)bannerView didFailWithError:(NSError *)error;

/// A viewable impression was recorded.
- (void)adBannerViewDidTrackImpression:(AdBannerView *)bannerView;

/// The user tapped the ad.
- (void)adBannerViewDidTrackClick:(AdBannerView *)bannerView;

@end

/// A banner container the publisher drops into its view hierarchy.
/// It renders HTML ad markup inside a web view and reports back via `delegate`.
@interface AdBannerView : UIView

@property (nonatomic, weak, nullable) id<AdBannerViewDelegate> delegate;

/// Create a banner with a fixed ad size (e.g. 320x50).
- (instancetype)initWithSize:(CGSize)size;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)initWithFrame:(CGRect)frame NS_UNAVAILABLE;
- (instancetype)initWithCoder:(NSCoder *)coder NS_UNAVAILABLE;

/// Render the given HTML ad markup. Safe to call from any thread.
- (void)loadWithMarkup:(NSString *)markup;

/// Tear down. After this returns, no further delegate callbacks may fire.
- (void)stopTracking;

@end

NS_ASSUME_NONNULL_END
