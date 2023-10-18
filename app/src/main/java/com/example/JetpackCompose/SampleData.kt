package com.example.JetpackCompose

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        com.example.JetpackCompose.Message(
            "User",
            "Hello! How can I help you?"
        ),
        com.example.JetpackCompose.Message(
            "Colleague",
            "Hi! I have a question about Android development."
        ),
        com.example.JetpackCompose.Message(
            "User",
            "Sure, I'd be happy to help. What do you need to know?"
        ),
        com.example.JetpackCompose.Message(
            "Colleague",
            "I'm wondering about the latest Android versions and their features."
        ),
        com.example.JetpackCompose.Message(
            "User",
            "Here's a list of some recent Android versions:\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n" +
                    "Each version comes with its own set of features and improvements."
        ),
        com.example.JetpackCompose.Message(
            "Colleague",
            "That's helpful, thanks! I've also heard a lot about Kotlin. What do you think of it?"
        ),
        com.example.JetpackCompose.Message(
            "User",
            "Kotlin is a fantastic language! It's concise, expressive, and interoperable with Java. " +
                    "Many Android developers prefer it for its modern features and reduced boilerplate code."
        ),
        com.example.JetpackCompose.Message(
            "Colleague",
            "I'll definitely give it a try. And what about Jetpack Compose?"
        ),
        com.example.JetpackCompose.Message(
            "User",
            "Jetpack Compose is a modern UI toolkit for building native Android UIs. " +
                    "It's designed to make UI development easier and more efficient. You should definitely check it out!"
        ),
        com.example.JetpackCompose.Message(
            "Colleague",
            "Sounds great! I'll explore both Kotlin and Jetpack Compose. Thanks for the advice!"
        ),
        com.example.JetpackCompose.Message(
            "User",
            "You're welcome! If you have any more questions, feel free to ask."
        )
    )
}
