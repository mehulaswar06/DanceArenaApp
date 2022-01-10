package com.example.the_dance_arena_sam.common

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey




@Entity(tableName = "setData")
data class DanceData(
    @PrimaryKey
    val id:Int?,
    val title:String?,
    val origin:String?,
    val exponent:String?,
    val overview:String?
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(origin)
        parcel.writeString(exponent)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DanceData> {
        override fun createFromParcel(parcel: Parcel): DanceData {
            return DanceData(parcel)
        }

        override fun newArray(size: Int): Array<DanceData?> {
            return arrayOfNulls(size)
        }
    }
}