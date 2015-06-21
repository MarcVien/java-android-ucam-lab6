package com.laboratorio2.marcelo.laboratorio7;

//import android.widget.SpinnerAdapter;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by Marcelo on 20/06/2015.
 */
public class AdaptadorImagens extends BaseAdapter {
    int itensMinhaGaleria;
    private Integer[] minhasImagens = {
      R.drawable.mk1,
      R.drawable.mk2,
      R.drawable.mk3,
    };
    PrincipalActivity contexto;
    public AdaptadorImagens(PrincipalActivity principalActivity) {
        contexto = principalActivity;
        TypedArray atributos = contexto.obtainStyledAttributes(R.styleable.minhaGaleria);
        itensMinhaGaleria = atributos.getResourceId(R.styleable.minhaGaleria_android_galleryItemBackground,0);

    }

    public int getCount()
    {
        return minhasImagens.length;
    }

    public Object getItem(int position)
    {
        return position;
    }

    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(contexto);
        imageView.setImageResource(minhasImagens[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(150,100));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(itensMinhaGaleria);

        return imageView;
    }

}
