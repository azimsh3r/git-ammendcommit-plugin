package com.github.azimsh3r.gitammendcommitplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import java.io.File

class RenameCommitAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val newCommitMessage = Messages.showInputDialog(
            e.project,
            "Enter new commit message:",
            "Amend Commit Message",
            Messages.getQuestionIcon()
        )

        if (newCommitMessage.isNullOrEmpty()) return

        val gitDir = File(e.project?.basePath ?: return)

        val processBuilder = ProcessBuilder(
            "git", "commit", "--amend", "-m", newCommitMessage
        )
        processBuilder.directory(gitDir)

        try {
            val process = processBuilder.start()
            process.waitFor()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}
