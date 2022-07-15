package com.example.dialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dialogbox.model.UserData
import com.example.dialogbox.view.UserAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var add: FloatingActionButton
    private lateinit var rec: RecyclerView
    private lateinit var userList: ArrayList<UserData>
    private lateinit var useradapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Set List*/
        userList = ArrayList()

        /*Set Id */
        add = findViewById(R.id.addingBtn)
        rec = findViewById(R.id.mRecycler)

        /* Set Adapter*/
        useradapter = UserAdapter(userList)

        /*Set Recycler ViewAdapter*/
        rec.layoutManager = LinearLayoutManager(this)
        rec.adapter = useradapter

        add.setOnClickListener { addInfo() }
    }

        private fun addInfo() {
            val k = LayoutInflater.from(this).inflate(R.layout.add_item, null)

            val uName = k.findViewById<EditText>(R.id.userName)
            val uNo = k.findViewById<EditText>(R.id.userNo)

            val box = AlertDialog.Builder(this)

            box.setView(k)
            box.setPositiveButton("ok") { dialog, _ ->
                val name = uName.text.toString()
                val text = uNo.text.toString()
                userList.add(UserData("Name:$name","pass:$text"))
                useradapter.notifyDataSetChanged()
                Toast.makeText(this, "Add Successfully", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            box.setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()

            }
            box.create()
            box.show()
        }

    }




