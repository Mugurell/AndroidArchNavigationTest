package petrumugurel.site.androidarchnavigationtest

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import petrumugurel.site.androidarchnavigationtest.BlankFragment.Fragment1InteractionListener
import petrumugurel.site.androidarchnavigationtest.BlankFragment2.Fragment2InteractionListener
import androidx.navigation.ui.NavigationUI




class MainActivity :
        AppCompatActivity(),
        Fragment1InteractionListener, Fragment2InteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBarWithNavController(this, findNavController(R.id.my_nav_host))
    }

    override fun onSupportNavigateUp() = findNavController(R.id.my_nav_host).navigateUp()


    override fun onFragment1Interaction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragment2Interaction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
