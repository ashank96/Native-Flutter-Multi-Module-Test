package com.ashank.module2;

import android.content.Context;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrantmodule7;

/**
 * Created by ashankbharati on 09,June,2020
 */
public class Module2Activity extends FlutterActivity {

	@Override
	public FlutterEngine provideFlutterEngine(Context context) {
		return new FlutterEngine(context);
	}

	@Override
	public String getDartEntrypointFunctionName() {
		return "myMainDartMethodB";
	}

	@Override
	public void configureFlutterEngine(FlutterEngine flutterEngine) {
		GeneratedPluginRegistrantmodule7.registerWith(flutterEngine);
	}
}
