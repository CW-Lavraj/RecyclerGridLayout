package diedav.david.diego.recyclerviewgridlayout.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import diedav.david.diego.recyclerviewgridlayout.R;

public class PlaceActivity extends AppCompatActivity {

    String name;
    String country;
    int image;
    @Bind(R.id.imgPlace)
    ImageView imgPlace;
    @Bind(R.id.txtName)
    TextView txtName;
    @Bind(R.id.txtCountry)
    TextView txtCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        ButterKnife.bind(this);

        //get extras
        Bundle bundle = getIntent().getExtras();
        image = bundle.getInt("imgId");
        name = bundle.getString("name");
        country = bundle.getString("country");

        imgPlace.setImageResource(image);
        txtName.setText("Name: "+name);
        txtCountry.setText("Country: "+country);

    }

}
