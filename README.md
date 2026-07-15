# Verve Interview Tasks

Welcome to the Verve Interview Kit repository! This repository contains interview tasks for multiple platforms.

## Available Interview Kits

- [Android](#android-interview-kit)
- [iOS](#ios-interview-kit)
- Backend (Coming Soon)

---

## Android Interview Kit

### Prerequisites

- [Android Studio](https://developer.android.com/studio) (latest stable version recommended)
- Git installed on your machine

### Getting Started

Since this is a multi-platform repository, the Android project is located in the `android/` subdirectory. Follow these steps to correctly open the project in Android Studio:

#### Step 1: Clone the Repository

```bash
git clone https://github.com/AskVerve/verve-interview-tasks-public.git
```

#### Step 2: Open the Android Project in Android Studio

1. Open **Android Studio**
2. Click on **File** → **Open...**
3. Navigate to the cloned repository folder: `verve-interview-tasks-public`
4. **Important:** Select the `android` folder inside the cloned repository (not the root folder)
5. Click **Open**

> ⚠️ **Note:** Make sure to select the `android` folder, not the root `verve-interview-tasks-public` folder. Android Studio needs to detect the `settings.gradle` file located in the `android/` directory to properly recognize it as an Android project.

#### Step 3: Sync and Build

1. Wait for Android Studio to index the project and sync Gradle
2. If prompted, accept any SDK or dependency updates
3. Once the sync is complete, you should be able to build and run the project

### Troubleshooting

- **Gradle sync fails:** Ensure you have a stable internet connection and the required SDK versions installed
- **Project not recognized:** Make sure you opened the `android/` folder, not the repository root
- **JDK issues:** Android Studio typically bundles its own JDK. If you face issues, go to **File** → **Project Structure** → **SDK Location** and verify the JDK path

---

## iOS Interview Kit

### Prerequisites

- [Xcode](https://developer.apple.com/xcode/) (latest stable version recommended; iOS 15.0+ deployment target)
- Git installed on your machine
- (Optional) [XcodeGen](https://github.com/yonaskolb/XcodeGen) — only needed if you want to regenerate the Xcode project from `project.yml`

### Getting Started

Since this is a multi-platform repository, the iOS project is located in the `ios/` subdirectory. Follow these steps to correctly open the project in Xcode:

#### Step 1: Clone the Repository

```bash
git clone https://github.com/AskVerve/verve-interview-tasks-public.git
```

#### Step 2: Open the iOS Project in Xcode

1. Open **Xcode**
2. Click on **File** → **Open...**
3. Navigate to the cloned repository folder: `verve-interview-tasks-public`
4. **Important:** Open the `ios/AdBannerInterview.xcodeproj` file (not the root folder)
5. Click **Open**

> ⚠️ **Note:** The `AdBannerInterview.xcodeproj` file is committed, so you can open it directly. If you have [XcodeGen](https://github.com/yonaskolb/XcodeGen) installed and prefer to regenerate the project, run `xcodegen generate` from inside the `ios/` directory before opening it.

#### Step 3: Build and Run

1. In the scheme selector, choose the **DemoHost** scheme
2. Select an iOS Simulator (or a connected device)
3. Press **⌘R** (or click **Run**) to build and launch the app

> The project contains two targets: **AdBannerKit** (the ad-serving framework — a mixed Objective-C + Swift module) and **DemoHost** (a minimal publisher app that embeds the SDK). Implementation details will be discussed during the interview session.

### Troubleshooting

- **Build fails immediately:** Ensure you are running a recent stable version of Xcode and that the Command Line Tools are installed (**Xcode** → **Settings** → **Locations** → **Command Line Tools**)
- **Project won't open / looks empty:** Make sure you opened `ios/AdBannerInterview.xcodeproj`, not the repository root. If you regenerated the project with XcodeGen, confirm it completed without errors
- **Code signing errors:** The project sets `CODE_SIGNING_ALLOWED = NO`, so a Simulator run should not require signing. To run on a physical device, select your own development team under the target's **Signing & Capabilities**

---


