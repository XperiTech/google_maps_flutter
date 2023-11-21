package example.android.app.src.main.java.io.flutter.plugins.googlemapsexample;

import android.os.Bundle;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;

public class EmbeddingV1Activity extends io.flutter.app.FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GoogleMapsPlugin.registerWith(registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));

  }
}
