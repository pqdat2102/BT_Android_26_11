package com.example.studentmanager3

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class StudentListFragmentDirections private constructor() {
  private data class ActionToAddEditStudentFragment(
    public val name: String,
    public val mssv: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_to_addEditStudentFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        result.putString("mssv", this.mssv)
        return result
      }
  }

  public companion object {
    public fun actionToAddEditStudentFragment(name: String, mssv: String): NavDirections =
        ActionToAddEditStudentFragment(name, mssv)
  }
}
