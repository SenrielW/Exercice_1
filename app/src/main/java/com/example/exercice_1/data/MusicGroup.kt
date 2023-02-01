package com.example.exercice_1.data

import android.os.Parcel
import android.os.Parcelable

data class MusicGroup(var name:String?, var style:String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(style)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MusicGroup> {
        override fun createFromParcel(parcel: Parcel): MusicGroup {
            return MusicGroup(parcel)
        }

        override fun newArray(size: Int): Array<MusicGroup?> {
            return arrayOfNulls(size)
        }
    }

}
