package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


// @StringRes,@DrawableRes  用Resource annotations寫法，避免都是int type而呼叫錯誤
data class Affirmation(
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId:Int
    ) {
}