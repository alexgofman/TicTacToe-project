package com.example.tictactoe;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.CameraUpdateFactory;

import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.os.Bundle;
import android.provider.SyncStateContract.Constants;
import android.support.v4.app.FragmentActivity;

public class Maps_Activity extends FragmentActivity {

	private GoogleMap mMap;
    double latitude;
    double longitude;
      
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_layout);
        
        Intent out = getIntent();
        String strLatit = out.getStringExtra("latit");
        String strLongit = out.getStringExtra("longit");
        
         latitude=Double.parseDouble(strLatit);
         longitude=Double.parseDouble(strLongit);
         setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }
    
    
    private void setUpMapIfNeeded() {
      if (mMap != null) {
            return;
        }
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        Marker TP = mMap.addMarker(new MarkerOptions().
                position(new LatLng(latitude , longitude)).title("You are here, comrade!"));
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        Criteria criteria = new Criteria();

//        Location location = TP.getLastKnownLocation(TP.getBestProvider(criteria, false));
//        if (location != null)
//        {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(Double.valueOf(latitude), Double.valueOf(longitude)), 13));
        
//        double lat= location.getLatitude();
//        double lng = location.getLongitude();
        LatLng ll = new LatLng(latitude, longitude);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ll, 20));

            CameraPosition cameraPosition = new CameraPosition.Builder()
            .target(new LatLng(Double.valueOf(latitude), Double.valueOf(longitude)))      // Sets the center of the map to location user
            .zoom(17)                   // Sets the zoom
            .bearing(90)                // Sets the orientation of the camera to east
            .tilt(40)                   // Sets the tilt of the camera to 30 degrees
            .build();                   // Creates a CameraPosition from the builder
            mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

      //  }

        if (mMap == null) {
            return;
        }
    }
	
}
