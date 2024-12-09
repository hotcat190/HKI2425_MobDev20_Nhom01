package com.example.androidcookbook.ui.features.post.details

import com.example.androidcookbook.domain.model.post.Comment
import com.example.androidcookbook.domain.model.post.Post

sealed interface PostUiState {
    data class Success(val post: Post) : PostUiState
    data class Error(val message: String) : PostUiState
    data object Loading : PostUiState
}

sealed interface EditCommentState {
    data object NotEditing : EditCommentState
    data class Editing(val comment: Comment) : EditCommentState
}

sealed interface ShowToastState {
    data object NotShowing : ShowToastState
    data class Showing(val message: String) : ShowToastState
}