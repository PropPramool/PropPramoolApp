package com.example.kaogi.proppra;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class PriceMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_maps);
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

        // Add a marker in Sydney and move the camera
        mMap = googleMap;


        BitmapDrawable bitmapdraw1=(BitmapDrawable)getResources().getDrawable(R.drawable.i1);
        Bitmap b1=bitmapdraw1.getBitmap();
        Bitmap small1 = Bitmap.createScaledBitmap(b1, 84, 84, false);
        BitmapDrawable bitmapdraw2=(BitmapDrawable)getResources().getDrawable(R.drawable.i2);
        Bitmap b2=bitmapdraw2.getBitmap();
        Bitmap small2 = Bitmap.createScaledBitmap(b2, 84, 84, false);
        BitmapDrawable bitmapdraw3=(BitmapDrawable)getResources().getDrawable(R.drawable.i3);
        Bitmap b3=bitmapdraw3.getBitmap();
        Bitmap small3 = Bitmap.createScaledBitmap(b3, 84, 84, false);
        BitmapDrawable bitmapdraw4=(BitmapDrawable)getResources().getDrawable(R.drawable.i4);
        Bitmap b4=bitmapdraw4.getBitmap();
        Bitmap small4 = Bitmap.createScaledBitmap(b4, 84, 84, false);
        BitmapDrawable bitmapdraw5=(BitmapDrawable)getResources().getDrawable(R.drawable.i5);
        Bitmap b5=bitmapdraw5.getBitmap();
        Bitmap small5 = Bitmap.createScaledBitmap(b5, 84, 84, false);
        BitmapDrawable bitmapdraw6=(BitmapDrawable)getResources().getDrawable(R.drawable.i6);
        Bitmap b6=bitmapdraw6.getBitmap();
        Bitmap small6 = Bitmap.createScaledBitmap(b6, 84, 84, false);
        BitmapDrawable bitmapdraw7=(BitmapDrawable)getResources().getDrawable(R.drawable.i7);
        Bitmap b7=bitmapdraw7.getBitmap();
        Bitmap small7 = Bitmap.createScaledBitmap(b7, 84, 84, false);
        BitmapDrawable bitmapdraw8=(BitmapDrawable)getResources().getDrawable(R.drawable.i8);
        Bitmap b8=bitmapdraw8.getBitmap();
        Bitmap small8 = Bitmap.createScaledBitmap(b8, 84, 84, false);
        BitmapDrawable bitmapdraw9=(BitmapDrawable)getResources().getDrawable(R.drawable.i9);
        Bitmap b9=bitmapdraw9.getBitmap();
        Bitmap small9 = Bitmap.createScaledBitmap(b9, 84, 84, false);



        // Add a marker in Sydney and move the camera
        LatLng LKB = new LatLng(13.73, 100.775);
        Polygon polygon1 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(13.728, 100.763), new LatLng(13.724, 100.7628), new LatLng(13.7246, 100.767), new  LatLng(13.727867, 100.769028))
                .strokeColor(0x33FFFF00)
                .fillColor(0x33FFFF00));
        Polygon polygon2 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(13.730160, 100.760677), new LatLng(13.728602, 100.760393), new LatLng(13.728105, 100.764669), new  LatLng(13.728287, 100.768941), new  LatLng(13.731539, 100.769027), new  LatLng(13.730752, 100.762689))
                .strokeColor(0x3300FF00)
                .fillColor(0x3300FF00));
        Polygon polygon3 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(13.727816, 100.769278), new LatLng(13.724572, 100.769519), new LatLng(13.724556, 100.771056), new  LatLng(13.727817, 100.771064))
                .strokeColor(0x33FF0000)
                .fillColor(0x33FF0000));
        Polygon polygon4 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(13.723965, 100.766618), new LatLng(13.715658, 100.766875), new LatLng(13.716522, 100.771959), new  LatLng(13.721564, 100.775947),new  LatLng(13.723776, 100.776041))
                .strokeColor(0x33FFFF00)
                .fillColor(0x33FFFF00));
        Polygon polygon5 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(13.724013, 100.781826), new LatLng(13.716863, 100.781772), new LatLng(13.717035, 100.785162), new  LatLng(13.721793, 100.785346),new  LatLng(13.723901, 100.785343))
                .strokeColor(0x33FF0000)
                .fillColor(0x33FF0000));
        Polygon polygon6 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(13.724016, 100.776599), new LatLng(13.716387, 100.776642), new LatLng(13.716793, 100.780408), new  LatLng(13.723943, 100.781459))
                .strokeColor(0x3300FF00)
                .fillColor(0x3300FF00));
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);
        Marker marker = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.722711, 100.768362))
                .title("บ้านสองชั้น พร้อมห้องน้ำ")
                .icon(BitmapDescriptorFactory.fromBitmap(small6))
                .snippet("500,000 บาท"));

        Marker marker2 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.721596, 100.772417))
                .icon(BitmapDescriptorFactory.fromBitmap(small4))
                .title("ห้องแถว")
                .snippet("700,000 บาท"));
        Marker marker3 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.724723, 100.770207))
                .title("คฤหาส์ริมคลอง")
                .icon(BitmapDescriptorFactory.fromBitmap(small1))
                .snippet("15,000,000 บาท"));
        Marker marker4 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.727847, 100.770364))
                .icon(BitmapDescriptorFactory.fromBitmap(small9))
                .title("ตึกสำนักงาน25ชั้น")
                .snippet("25,000,000 บาท"));
        Marker marker5 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.727618, 100.766330))
                .icon(BitmapDescriptorFactory.fromBitmap(small8))
                .title("ที่ดินเปล่า1ไร่")
                .snippet("750,000 บาท"));
        Marker marker6 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.729828, 100.762596))
                .icon(BitmapDescriptorFactory.fromBitmap(small7))
                .title("ส่วนลำไย 1.5 ไร่")
                .snippet("400,000 บาท"));
        Marker marker7 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.721644, 100.779747))
                .title("บ้านสองชั้นหลังตลาด")
                .icon(BitmapDescriptorFactory.fromBitmap(small3))
                .snippet("400,000 บาท"));
        Marker marker8 = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.721748, 100.784564))
                .title("ทาว์นเฮาส์ 4ชั้น")
                .icon(BitmapDescriptorFactory.fromBitmap(small2))
                .snippet("2,000,000 บาท"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(LKB));
        mMap.animateCamera(zoom);;
    }
}
