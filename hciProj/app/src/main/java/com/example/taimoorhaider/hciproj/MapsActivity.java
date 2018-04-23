package com.example.taimoorhaider.hciproj;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback , GoogleMap.OnMarkerClickListener
{

    private ClusterManager<MyItem> mClusterManager;


    private static final LatLng DataDarbar = new LatLng(31.578951, 74.305805);
    private static final LatLng SYDNEY = new LatLng(31.535662, 74.298531);
    private static final LatLng BRISBANE = new LatLng(31.439347, 74.311542);
    private static final LatLng A = new LatLng(31.410272, 74.279679);
    private static final LatLng AA = new LatLng(31.401444, 74.274830);
    private static final LatLng AAA = new LatLng(31.395966, 74.303614);
    private static final LatLng Q = new LatLng(31.578951, 74.375805);
    private static final LatLng QQ= new LatLng(31.578951, 74.365805);
    private static final LatLng QQQ= new LatLng(31.578951, 74.355805);
    private static final LatLng S = new LatLng(31.578951, 74.345805);
    private static final LatLng SS= new LatLng(31.578951, 74.335805);
    private static final LatLng SSS= new LatLng(31.578951, 74.325805);
    private static final LatLng D= new LatLng(31.578951, 74.315805);
//    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
//    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);
//    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
//    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);
//    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
//    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);
//    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
//    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);
//    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
//    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);
//    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
//    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);




    private Marker mDataDarbar ;
    private Marker mSydney;
    private Marker mBrisbane;
    private Marker a;
    private Marker aa;
    private Marker aaa;
    private Marker q;
    private Marker qq;
    private Marker qqq;
    private Marker s;
    private Marker ss;
    private Marker sss;
    private Marker d;



    private GoogleMap mMap;

    // Create a LatLngBounds that includes the city of Adelaide in Australia.
    private LatLngBounds Lahore = new LatLngBounds(
            new LatLng(31.354688, 74.170404), new LatLng(31.728790, 74.435131));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setLatLngBoundsForCameraTarget(Lahore);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lahore .getCenter(), 10.2f));

        // Add some markers to the map, and add a data object to each marker.
        mDataDarbar = mMap.addMarker(new MarkerOptions()
                .position(DataDarbar )
                .title("Data Darbar "));
        mDataDarbar.setTag(0);

        mSydney = mMap.addMarker(new MarkerOptions()
                .position(SYDNEY)
                .title("Sydney"));
        mSydney.setTag(0);

        mBrisbane = mMap.addMarker(new MarkerOptions()
                .position(BRISBANE)
                .title("Brisbane"));
        mBrisbane.setTag(0);


        mSydney = mMap.addMarker(new MarkerOptions()
                .position(A)
                .title("Sydney"));
        mSydney.setTag(0);

        mBrisbane = mMap.addMarker(new MarkerOptions()
                .position(AA)
                .title("Brisbane"));
        mBrisbane.setTag(0);

        mSydney = mMap.addMarker(new MarkerOptions()
                .position(AAA)
                .title("Sydney"));
        mSydney.setTag(0);

        mBrisbane = mMap.addMarker(new MarkerOptions()
                .position(Q)
                .title("Brisbane"));
        mBrisbane.setTag(0);

        mSydney = mMap.addMarker(new MarkerOptions()
                .position(QQ)
                .title("Sydney"));
        mSydney.setTag(0);

        mBrisbane = mMap.addMarker(new MarkerOptions()
                .position(QQQ)
                .title("Brisbane"));
        mBrisbane.setTag(0);



        mSydney = mMap.addMarker(new MarkerOptions()
                .position(S)
                .title("Sydney"));
        mSydney.setTag(0);

        mBrisbane = mMap.addMarker(new MarkerOptions()
                .position(SS)
                .title("Brisbane"));
        mBrisbane.setTag(0);



        mSydney = mMap.addMarker(new MarkerOptions()
                .position(SSS)
                .title("Sydney"));
        mSydney.setTag(0);

        mBrisbane = mMap.addMarker(new MarkerOptions()
                .position(D)
                .title("Brisbane"));
        mBrisbane.setTag(0);








        // Set a listener for marker click.
          mMap.setOnMarkerClickListener(this);

        setUpClusterer();
//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


    }
    /** Called when the user clicks a marker. */
    @Override
    public boolean onMarkerClick(final Marker marker) {

        // Retrieve the data from the marker.
        Integer clickCount = (Integer) marker.getTag();

        // Check if a click count was set, then display the click count.
        if (clickCount != null) {
            clickCount = clickCount + 1;
            marker.setTag(clickCount);
            Toast.makeText(this,
                    marker.getTitle() +
                            " has been clicked " + clickCount + " times.",
                    Toast.LENGTH_SHORT).show();
        }

        // Return false to indicate that we have not consumed the event and that we wish
        // for the default behavior to occur (which is for the camera to move such that the
        // marker is centered and for the marker's info window to open, if it has one).
        return false;
    }


//// Constrain the camera target to the Adelaide bounds
//    // Declare a variable for the cluster manager.

    private void setUpClusterer() {

        // Initialize the manager with the context and the map.
        // (Activity extends context, so we can pass 'this' in the constructor.)
        mClusterManager = new ClusterManager<MyItem>(this, mMap );

        // Point the map's listeners at the listeners implemented by the cluster
        // manager.
        mMap.setOnCameraIdleListener(mClusterManager);
        mMap.setOnMarkerClickListener(mClusterManager);
        mMap.setOnInfoWindowClickListener(mClusterManager);
        // Add cluster items (markers) to the cluster manager.
        addItems();
    }

    private void addItems() {

        // Set some lat/lng coordinates to start with.
        double lat = 31.578951;
        double lng = 74.305805;

        // Add ten cluster items in close proximity, for purposes of this example.
        for (int i = 0; i < 10; i++) {
            double offset = i / 60d;
            lat = lat + offset;
            lng = lng + offset;
            MyItem offsetItem = new MyItem(lat, lng);
            mClusterManager.addItem(offsetItem);
            mClusterManager.cluster();
        }
    }

}
