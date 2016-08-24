package diedav.david.diego.recyclerviewgridlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import diedav.david.diego.recyclerviewgridlayout.adapters.PlaceCardAdapter;
import diedav.david.diego.recyclerviewgridlayout.model.Place;

public class MainActivity extends AppCompatActivity {

    //variables
    private RecyclerView recycler;
    private PlaceCardAdapter adapter;
    private RecyclerView.LayoutManager lManager;
    private List<Place> listItemsPlaces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       adListPlaces();
        startRecycler();

    }


    //create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    //select item menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.id_linearHorizontal:
                LinearLayoutManager lmHorizontal = new LinearLayoutManager(this);
                lmHorizontal.setOrientation(LinearLayoutManager.HORIZONTAL);
                recycler.setLayoutManager(lmHorizontal);
                break;

            case R.id.id_linearVertical:
                LinearLayoutManager lmVertical = new LinearLayoutManager(this);
                lmVertical.setOrientation(LinearLayoutManager.VERTICAL);
                recycler.setLayoutManager(lmVertical);
                break;
            case R.id.id_gridView:
                GridLayoutManager lmGrid = new GridLayoutManager(this, 3);
                recycler.setLayoutManager(lmGrid);
                break;
            case R.id.id_staggeredHorizontal:
                StaggeredGridLayoutManager lmStaggeredHorizontal = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
                recycler.setLayoutManager(lmStaggeredHorizontal);
                break;
            case R.id.id_staggeredVertical:
                StaggeredGridLayoutManager lmStaggeredVertical = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                recycler.setLayoutManager(lmStaggeredVertical);
                break;
        }

        return super.onOptionsItemSelected(item);
    }





    //================METHODS========================//
    private void adListPlaces() {
        Place venecia = new Place(R.drawable.venecia,"Venecia Canal","Italy");
        Place egipto = new Place(R.drawable.egipto,"Egyptian pyramids","Egypt");
        Place london = new Place(R.drawable.london,"Houses of Parliamen","England");
        Place machu_picchu = new Place(R.drawable.machu_picchu,"Machu Picchu","Perú");
        Place galapagos = new Place(R.drawable.galapagos,"Galapagos","Ecuador");
        Place paris = new Place(R.drawable.paris,"Eiffel Tower","France");
        Place roma = new Place(R.drawable.roma,"Roman Coliseum","Italy");
        Place san_francisco = new Place(R.drawable.san_francisco,"Golden Gate Bridge","United States");
        Place taj_mahal = new Place(R.drawable.taj_mahal,"taj_Mahal","India");

        listItemsPlaces = new ArrayList<Place>();
        listItemsPlaces.add(venecia);
        listItemsPlaces.add(egipto);
        listItemsPlaces.add(london);
        listItemsPlaces.add(machu_picchu);
        listItemsPlaces.add(galapagos);
        listItemsPlaces.add(paris);
        listItemsPlaces.add(roma);
        listItemsPlaces.add(san_francisco);
        listItemsPlaces.add(taj_mahal);
    }


    private void startRecycler() {
        recycler = (RecyclerView) findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);

        //administrator for LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        //create new adapter
        adapter = new PlaceCardAdapter(listItemsPlaces,this);
        //add adapter
        recycler.setAdapter(adapter);

        recycler.setItemAnimator(new DefaultItemAnimator());
    }


}
