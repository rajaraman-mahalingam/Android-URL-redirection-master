package com.rajaraman.lauchpad;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WanderaBlockrules extends AppCompatActivity {

    private String youtube_pkg ="com.google.android.youtube";
    private String youtube_class="com.google.android.youtube.HomeActivity";
    private String facebook_pkg ="com.facebook.katana";
    private String facebook_class="com.facebook.katana.LoginActivity";
    private String whatsapp_pkg ="com.whatsapp";
    private String whatsapp_class="com.whatsapp.Main";
    private String Groupon_pkg ="com.groupon";
    private String Groupon_class="com.groupon.activity.TodaysDeal";
    private String Playstore_pkg ="com.android.vending";
    private String Playstore_class="com.android.vending.AssetBrowserActivity";
    private String instagram_pkg ="com.instagram.android";
    private String instagram_class="com.instagram.android.activity.MainTabActivity";
    private String pinterest_pkg ="com.pinterest";
    private String pinterest_class="com.pinterest.activity.PinterestActivity";
    private String linkedin_pkg ="com.linkedin.android";
    private String linkedin_class="com.linkedin.android.authenticator.LaunchActivity";
    private String tumblr_pkg ="com.tumblr";
    private String tumblr_class="com.tumblr.ui.activity.JumpoffActivity";
    private String snapchat_pkg ="com.snapchat.android";
    private String snapchat_class="com.snapchat.android.LandingPageActivity";
    private String tinder_pkg ="com.tinder";
    private String tinder_class="com.tinder.activities.ActivityLogin";
    private String wechat_pkg ="com.tencent.mm";
    private String wechat_class="com.tencent.mm.ui.LauncherUI";
    private String foursqr_pkg ="com.joelapenna.foursquared";
    private String foursqr_class="com.joelapenna.foursquared.MainActivity";
    private String gmaps_pkg ="com.google.android.apps.maps";
    private String gmaps_class="com.google.android.maps.MapsActivity";
    private String gdrive_pkg ="com.google.android.apps.docs";
    private String gdrive_class="com.google.android.apps.docs.app.NewMainProxyActivity";
    private String dropbox_pkg ="com.dropbox.android";
    private String dropbox_class="com.dropbox.android.activity.DropboxBrowser";
    private String box_pkg ="com.box.android";
    private String box_class="com.box.android.activities.login.SplashScreenActivity";
    private String onedrive_pkg ="com.microsoft.skydrive";
    private String onedrive_class="com.microsoft.skydrive.MainActivity";
    private String netflix_pkg ="com.netflix.mediaclient";
    private String netflix_class="com.netflix.mediaclient.ui.launch.UIWebViewActivity";
    private String settings_pkg ="com.android.settings";
    private String settings_class="com.android.settings.GridSettings";
    private String vimeo_pkg ="com.vimeo.android.videoapp";
    private String vimeo_class="com.vimeo.android.videoapp.activities.authentication.LaunchActivity";
    private String gchrome_pkg="com.android.chrome";
    private String gchrome_class="com.google.android.apps.chrome.Main";
    private String URL_to_open;

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21;
    private EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wandera_blockrules);
        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);
        bt5 = (Button) findViewById(R.id.button5);
        bt6 = (Button) findViewById(R.id.button6);
        bt7 = (Button) findViewById(R.id.button7);
        bt8 = (Button) findViewById(R.id.button8);
        bt9 = (Button) findViewById(R.id.button9);
        bt10 = (Button) findViewById(R.id.button10);
        bt11 = (Button) findViewById(R.id.button11);
        bt12 = (Button) findViewById(R.id.button12);
        bt13 = (Button) findViewById(R.id.button13);
        bt14 = (Button) findViewById(R.id.button14);
        bt15 = (Button) findViewById(R.id.button15);
        bt16 = (Button) findViewById(R.id.button16);
        bt17 = (Button) findViewById(R.id.button17);
        bt18 = (Button) findViewById(R.id.button18);
        bt19 = (Button) findViewById(R.id.button19);
        bt20 = (Button) findViewById(R.id.button20);
        bt21 = (Button) findViewById(R.id.button21);
        e1 = (EditText) findViewById(R.id.editText);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchYoutube();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchWhatsapp();

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFacebook();

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchInstagram();

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchGroupon();

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchPlaystore();


            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchPinterest();

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLinkedin();

            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchTumblr();

            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSnapchat();

            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchTinder();

            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchWechat();

            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch4square();

            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDropbox();

            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchBox();

            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchNetflix();

            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVimeo();

            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchGchrome();

            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL_to_open= "http://"+ String.valueOf(e1.getText());
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(URL_to_open));
                startActivity(intent);

            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchGmaps();

            }

        });
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();

            }
        });

    }


    public void open_url(){


    }
    public void launchFacebook() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(facebook_pkg, facebook_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void launchWhatsapp() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(whatsapp_pkg,whatsapp_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchDropbox() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(dropbox_pkg, dropbox_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchGroupon() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(Groupon_pkg, Groupon_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchPlaystore() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(Playstore_pkg,Playstore_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchInstagram() {
        Intent intent7 = new Intent();
        intent7.setAction(Intent.ACTION_MAIN);
        intent7.addCategory(Intent.CATEGORY_LAUNCHER);
        intent7.setComponent(new ComponentName(instagram_pkg,instagram_class));
        intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent7);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchBox() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(box_pkg,box_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchPinterest() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(pinterest_pkg,pinterest_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchLinkedin() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(linkedin_pkg,linkedin_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchTumblr() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(tumblr_pkg,tumblr_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launch1Drive() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(onedrive_pkg,onedrive_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchSnapchat() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(snapchat_pkg,snapchat_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchTinder() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(tinder_pkg,tinder_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchWechat() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(wechat_pkg,wechat_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchNetflix() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(netflix_pkg,netflix_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launch4square() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(foursqr_pkg,foursqr_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchGmaps() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(gmaps_pkg,gmaps_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchGdrive() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(gdrive_pkg,gdrive_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchSettings() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(settings_pkg,settings_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void launchYoutube() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(youtube_pkg, youtube_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void launchGchrome() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(gchrome_pkg, gchrome_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void launchVimeo() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(vimeo_pkg, vimeo_class));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wandera_blockrules, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
