//
//  AdBannerView.m
//  ┌──────────────────────────────────────────────────────────────────────┐
//  │  THIS IS YOUR CANVAS. Implement the behavior described in the header.  │
//  │                                                                        │
//  │  Reminders (an SDK runs inside someone else's app):                    │
//  │   • never block the host's main thread                                 │
//  │   • never crash the host                                               │
//  │   • fail gracefully — the delegate must be told, exactly once          │
//  │   • don't leak: weak delegate, clean web-view teardown, no callbacks   │
//  │     after -stopTracking                                                │
//  │                                                                        │
//  │  You may add Swift files to the framework and call into them via       │
//  │  #import <AdBannerKit/AdBannerKit-Swift.h> (see Internal/AdKitSupport). │
//  └──────────────────────────────────────────────────────────────────────┘
//

#import "AdBannerView.h"
#import <WebKit/WebKit.h>
// #import <AdBannerKit/AdBannerKit-Swift.h>   // uncomment to use Swift internals

@interface AdBannerView () <WKNavigationDelegate>
@property (nonatomic, strong, nullable) WKWebView *webView;
@property (nonatomic, assign) CGSize adSize;
@end

@implementation AdBannerView

- (instancetype)initWithSize:(CGSize)size {
    self = [super initWithFrame:CGRectMake(0, 0, size.width, size.height)];
    if (self) {
        _adSize = size;
    }
    return self;
}

- (void)loadWithMarkup:(NSString *)markup {
}

- (void)stopTracking {
}

@end
