package com.idn.smart.tiyas.pesonaindonesia

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PesonaIndonesia (
    var name : String,
    var description : String,
    var photo : String
        ) : Parcelable