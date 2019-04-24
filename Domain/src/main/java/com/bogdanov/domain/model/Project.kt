package com.bogdanov.domain.model

/*
    data model for domain layer
 */
class Project(val id: String, val name: String,
              val fullName: String, val starCount: String,
              val ownerName: String, val ownerAvatar: String,
              val isBookmarked: Boolean)