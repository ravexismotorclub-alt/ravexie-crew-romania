package ro.ravexis.crewromania;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showHome();
    }

    void showHome() {
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(25, 25, 25, 25);
        layout.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("RAVEXIS\nCREW ROMANIA");
        title.setTextColor(Color.RED);
        title.setTextSize(32);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        addButton("ACASĂ", "Bine ai venit în RAVEXIS CREW ROMANIA!");
        addButton("MEMBRI", "Profilurile membrilor clubului vor apărea aici.");
        addButton("GALERIE FOTO", "Aici vor apărea fotografiile clubului.");
        addButton("CONTACT", "RAVEXIS CREW ROMANIA");

        setContentView(layout);
    }

    void addButton(String name, String message) {
        Button button = new Button(this);
        button.setText(name);
        button.setOnClickListener(v -> {
            TextView info = new TextView(this);
            info.setText(message);
            info.setTextColor(Color.WHITE);
            info.setTextSize(20);
            info.setGravity(Gravity.CENTER);
            layout.addView(info);
        });
        layout.addView(button);
    }
}
