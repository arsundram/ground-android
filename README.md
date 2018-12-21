# Ground for Android

Ground is a free, map-centric data collection platform for occasionally
connected devices.

This is not an officially supported Google product; it is currently
being developed by volunteers on a best-effort basis.

## Contributing

First, read the [contribution guidelines](CONTRIBUTING.md). Ensure you
understand the code review and community guidelines and have signed 
the appropriate [CLA](https://cla.developers.google.com/). 

> :exclamation: We cannot accept contributions from contributors that 
> have not signed the appropriate CLA, so please be sure to sign one 
> before submitting your hard work!

After you have read and understood the contribution guidelines, read the 
following sections to learn how to fork this repository and contribute.

### Setup

The following instructions describe how to fork this repository in order 
to contribute to the ground-android codebase.

1. Fork this repository, see <https://help.github.com/articles/fork-a-repo/>.

2. Clone your fork:
    
    `git clone https://github.com/<username>/ground-android.git`
    
    Where `<username>` is your github username.

3. Add the base repository as a remote:
    
    `git remote add upstream https://github.com/google/ground-android.git`

4. Follow the instructions under the [Initial build configuration](#initial-build-configuration) section of this readme to set up your development environment.

### Development Workflow

After you have forked and cloned the repository, use the following steps to
make and manage changes. After you have finished making changes, you can 
submit them to the base repository using a pull request. 

1. Pull changes from the base repository's master branch:
    
    `git pull upstream master`

1. Create a new branch to track your changes:
    
    `git checkout -b <branch>`
    
    Where `<branch>` is a meaningful name for the branch you'll use to track
    changes.

1. Make and test changes locally.

1. Add your changes to the staging area:
    
    `git add <files>`
    
    Where `<files>` are the files you changed.
    
    > **Note:** Run `git add .` to add all currently modified files to the staging area.

1. Commit your changes:
    
    `git commit -m <message>`
    
    Where `<message>` is a meaningful, short message describing the purpose of
    your changes.

1. Pull changes from the base repository's master branch, resolve conflicts if
   necessary:
      
    `git pull upstream master`

1. Push your changes to your github account:
    
    `git push -u origin <branch>`
    
    Where `<branch>` is the branch name you used in step 2.

1. Create a [pull request](https://help.github.com/articles/about-pull-requests/) to have your changes reviewed and merged into the base 
repository. Reference the [issue](https://github.com/google/ground-android/issues) your changes resolve in either the commit message for your changes or in your pull request. 

    For more information on creating pull requests, see <https://help.github.com/articles/creating-a-pull-request/>. 
    
    To learn more about referencing issues in your pull request or commit messages, see <https://help.github.com/articles/closing-issues-using-keywords/>.
1. Celebrate!

## Initial build configuration

### Add Google Maps API Key(s)

Create google_maps_api.xml files in gnd/src/debug/res/values and
gnd/src/release/res/values, replacing API_KEY with debug and release Google Maps
API keys:

``` xml
<resources>
  <string name="google_maps_key" templateMergeStrategy="preserve"
  translatable="false">API_KEY</string>
</resources>
```

You can generate new keys at:

  https://developers.google.com/maps/documentation/android-api/signup.

Be sure the SHA-1 certificate fingerprint described in the API key generation instructions is  
registered with package name ```com.google.android.gnd``` in:

  https://console.cloud.google.com/apis/credentials

You can find the SHA-1 of the debug key generated by Android Studio with:

```
$ keytool -list -v -keystore "$HOME/.android/debug.keystore" \
  -alias androiddebugkey \
  -storepass android -keypass android
```

### Set up Firebase

1. Create a new Firebase project at:

    https://console.firebase.google.com/

2. Save config file for Android app to gnd/google-services.json:

    https://support.google.com/firebase/answer/7015592

This includes the API key and URL for your new Firebase project.
