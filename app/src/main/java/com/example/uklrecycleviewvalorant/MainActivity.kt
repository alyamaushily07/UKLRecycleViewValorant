package com.example.uklrecycleviewvalorant

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var rvAgent: RecyclerView? =null
    private var list: ArrayList<Agent> = arrayListOf()
    private var title: String = "Mode List"

    private fun showSelectedAgent(Agent: Agent) {
        Toast.makeText(this, "Kamu memilih " + Agent.name, Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvAgent = findViewById(R.id.rv_agent)
        rvAgent?.setHasFixedSize(true)

        list.addAll(AgentData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAgent?.layoutManager = LinearLayoutManager(this)
        val ListAgentAdapter = ListAgentAdapter(list)
        rvAgent?.adapter = ListAgentAdapter
        ListAgentAdapter.setOnItemClickCallback(object : ListAgentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Agent) {
                showSelectedAgent(data)
            }})

    }
    private fun showRecyclerCardView() {
        rvAgent?.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAgentAdapter(list)
        rvAgent?.adapter = cardViewHeroAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
        }
    }

    private fun showRecyclerGrid() {
        rvAgent?.layoutManager = GridLayoutManager(this, 2)
        val gridAgentAdapter = GridAgentAdapter(list)
        rvAgent?.adapter = gridAgentAdapter
        gridAgentAdapter.setOnItemClickCallback(object : GridAgentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Agent) {
                showSelectedAgent(data)
            }
        })

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
