package org.example.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSAwalBros extends ListActivity {
        protected void onCreate (Bundle icecle) {
            super.onCreate(icecle);
            String[] listAct = new String[] {"Call Center","SMS Center","Driving Direction","Website","Exit"};
            this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));

        }

        protected void onListItemClick (ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);
            Object o = this.getListAdapter().getItem(position);
            String pilihan = o.toString();
            tampilkanpilihan(pilihan);

        }

        private void tampilkanpilihan(String pilihan) {
            try{
                Intent a = null;
                if (pilihan.equals("Call Center")) {
                    String nomortel = "tel:08896931325";
                    a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

                } else if (pilihan.equals("SMS Center"))
                {
                    String smsText="Aditya Dyan Ramadhan";
                    a = new Intent(Intent.ACTION_VIEW);
                    a.setData(Uri.parse("sms : 08896931325"));
                    a.putExtra("sms_body",smsText);

                } else if (pilihan.equals("Driving Direction"))
                {
                    String lokasirs ="google.navigation:q=0.463823,101.390353";
                    a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));

                } else if (pilihan.equals("Website"))
                {
                    String website = "http://awalbros.com";
                    a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

                } else if (pilihan.equals("Exit"))
                {




                }
                startActivity(a);

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
}
