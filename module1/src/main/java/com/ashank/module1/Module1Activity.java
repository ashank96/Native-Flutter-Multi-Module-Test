package com.ashank.module1;

import android.content.Context;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrantmodule1;

/**
 * Created by ashankbharati on 09,June,2020
 */
public class Module1Activity extends FlutterActivity {

	@Override
	public FlutterEngine provideFlutterEngine(Context context) {
		return new FlutterEngine(context);
	}

	@Override
	public String getDartEntrypointFunctionName() {
		return "myMainDartMethodA";
	}

	@Override
	public void configureFlutterEngine(FlutterEngine flutterEngine) {
		GeneratedPluginRegistrantmodule1.registerWith(flutterEngine);
	}
}
