package cl.isisur.eliasfigueroafc;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;




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
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        LatLng Cancha = new LatLng(-36.518374, -72.052535);
        LatLng Cancha1= new LatLng(-36.477068, -71.949130);
        LatLng Cancha2= new LatLng(-36.434777, -71.965449);
        LatLng Cancha3= new LatLng(-36.417626, -71.967038);
        LatLng Cancha4= new LatLng(-36.416579, -71.968787);
        LatLng Cancha5= new LatLng(-36.415083, -71.955172);
        LatLng Cancha6= new LatLng(-36.429304, -71.924707);
        LatLng Cancha7= new LatLng(-36.450050, -71.851664);
        LatLng Cancha8= new LatLng(-36.463166, -71.725693);
        LatLng Cancha9= new LatLng(-36.361773, -71.781466);
        LatLng Cancha10= new LatLng(-36.550371, -71.550948);
        mMap.addMarker(new MarkerOptions().position(Cancha).title("Cancha Elias Figueroa"));
        mMap.addMarker(new MarkerOptions().position(Cancha1).title("Cancha San Camilo"));
        mMap.addMarker(new MarkerOptions().position(Cancha2).title("Estadio Municipal N° 1 San Carlos"));
        mMap.addMarker(new MarkerOptions().position(Cancha3).title("Cancha 11 de Septiembre"));
        mMap.addMarker(new MarkerOptions().position(Cancha4).title("Cancha La Bombonera"));
        mMap.addMarker(new MarkerOptions().position(Cancha5).title("Estadio Municipal N° 2 San Carlos"));
        mMap.addMarker(new MarkerOptions().position(Cancha6).title("Cancha U De Chile"));
        mMap.addMarker(new MarkerOptions().position(Cancha7).title("Cancha Real Arboleda"));
        mMap.addMarker(new MarkerOptions().position(Cancha8).title("Estadio Cachapoal"));
        mMap.addMarker(new MarkerOptions().position(Cancha9).title("Estadio Chacay"));
        mMap.addMarker(new MarkerOptions().position(Cancha10).title("Estadio Municipal San Fabian"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cancha));


    }


}