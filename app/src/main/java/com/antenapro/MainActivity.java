package com.antenapro;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.Toast;
import android.content.res.AssetManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.util.Log;

public class MainActivity extends Activity
{
    Button click;
    Context mcontex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=(Button)findViewById(R.id.log);
        mcontex=this;
        click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(mcontex);
                    LayoutInflater layoutInflater=LayoutInflater.from(mcontex);
                    final View infla=layoutInflater.inflate(R.layout.custom,null);

                    final EditText name=(EditText)infla.findViewById(R.id.edit1);
                    final EditText pass=(EditText)infla.findViewById(R.id.edit2);
                    final Button button2=(Button)infla.findViewById(R.id.log);
                    builder.setView(infla);
                    final AlertDialog alertDialog=builder.create();
                    button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String nam=name.getText().toString();
                                String pas=pass.getText().toString();
                                if(nam.equals("CoRinga") && pas.equals("Modz")){
                                    Toast.makeText(getApplicationContext(),"Seja Bem vindo",Toast.LENGTH_SHORT).show();
                                    MainActivity.this.startActivity(MainActivity.this.getPackageManager().getLaunchIntentForPackage("com.dts.freefireth"));
                                    AssetManager assetManager = getAssets();
                                    String[] files = null;
                                    InputStream in = null;
                                    OutputStream out = null;
                                    String filename = "assetindexer.ChmtrFErUImPUvnstlQ98bJ4L9I~3D";// TIPO assetindexer.P55WLj4N0lYAZDYI48MHMRu0lZ8~3D
                                    try
                                    {
                                        in = assetManager.open(filename);
                                        out = new FileOutputStream("/storage/emulated/0/Android/data/com.dts.freefireth/files/contentcache/Compulsory/android/gameassetbundles/avatar/" + filename);
                                        copyFile(in, out);
                                        in.close();
                                        in = null;
                                        out.flush();
                                        out.close();
                                        out = null;
                                    }
                                    catch(IOException e)
                                    {
                                        Log.e("tag", "Failed to copy asset file: " + filename, e);
                                    }
 
                            }
                           }
                            private void copyFile(InputStream in, OutputStream out) throws IOException
                            {
                                byte[] buffer = new byte[1024];
                                int read;
                                while((read = in.read(buffer)) != -1)
                                {
                                    out.write(buffer, 0, read);
                                    }
                                    alertDialog.dismiss();
            
                                }
                        });


                    alertDialog.show();
                }
			});
 }
                public void Limpar(View view) {
                    Injectt.deleteFile("/storage/emulated/0/Android/data/com.dts.freefireth/files/ymrtc_log_bak.txt");
                    Injectt.deleteFile("/storage/emulated/0/Android/data/com.dts.freefireth/files/reportnew.db");
                    Injectt.deleteFile("/storage/emulated/0/com.garena.msdk/guest100067.dat");
                    Injectt.deleteFile("/storage/emulated/0/Android/data/com.dts.freefireth/cache/UnityShaderCache");
                    Injectt.deleteFile("/storage/emulated/0/Android/data/com.dts.freefireth/files/ymrtc_log.txt");
                    Injectt.deleteFile("/storage/emulated/0/Android/data/com.dts.freefireth/cache");
                    Injectt.deleteFile("/storage/emulated/0/Android/data/com.dts.freefireth/files/contentcache/Compulsory/android/gameassetbundles/avatar/assetindexer.ChmtrFErUImPUvnstlQ98bJ4L9I~3D");
                    Toast.makeText(getApplicationContext(),"✓Antena Reset✓", Toast.LENGTH_SHORT).show();

    }
	
} 
