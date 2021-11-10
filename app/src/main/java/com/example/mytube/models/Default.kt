package com.example.mytube.models

import java.io.Serializable

data class Default(
    var height: Int = 0,
    var url: String = "",
    var width: Int = 0
): Serializable