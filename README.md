# Verve Interview Tasks

Welcome to the Verve Interview Kit repository! This repository contains interview tasks for multiple platforms.

## Available Interview Kits

- [Android](#android-interview-kit)
- iOS (Coming Soon)
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


