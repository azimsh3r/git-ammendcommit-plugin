# Git Commit Amend Plugin

This IntelliJ IDEA plugin adds a custom action to the **Git** section of the main toolbar. Upon clicking the action, a small popup will appear, allowing the user to amend the most recent commit message.

## Features

- **Commit Message Amendment**: The plugin allows users to change the message of the most recent commit by opening a popup to enter a new commit message.
- **Git Integration**: Uses the `git commit --amend` command to change the commit message from within the IDE.

## Usage

1. In the **Git** section of the main toolbar, click the "Amend Commit Message" button.
2. A popup will appear asking for the new commit message.
3. After entering the new message and confirming, the commit will be amended using `git commit --amend`.
