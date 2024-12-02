package com.example.studentmanager3

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddEditStudentFragmentArgs(
  public val name: String? = "",
  public val mssv: String? = "",
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("name", this.name)
    result.putString("mssv", this.mssv)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("name", this.name)
    result.set("mssv", this.mssv)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddEditStudentFragmentArgs {
      bundle.setClassLoader(AddEditStudentFragmentArgs::class.java.classLoader)
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
      } else {
        __name = ""
      }
      val __mssv : String?
      if (bundle.containsKey("mssv")) {
        __mssv = bundle.getString("mssv")
      } else {
        __mssv = ""
      }
      return AddEditStudentFragmentArgs(__name, __mssv)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AddEditStudentFragmentArgs {
      val __name : String?
      if (savedStateHandle.contains("name")) {
        __name = savedStateHandle["name"]
      } else {
        __name = ""
      }
      val __mssv : String?
      if (savedStateHandle.contains("mssv")) {
        __mssv = savedStateHandle["mssv"]
      } else {
        __mssv = ""
      }
      return AddEditStudentFragmentArgs(__name, __mssv)
    }
  }
}
