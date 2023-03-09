package co.selfdrive.demo.util.extension

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import co.selfdrive.demo.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


fun ImageView.loadImage(url: String) {
    Glide
        .with(context)
        .load(url)
        .placeholder(ColorDrawable(ContextCompat.getColor(context, R.color.primaryDark)))
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .into(this)
}

@BindingAdapter(value = ["imageUrl", "placeholder"], requireAll = false)
fun ImageView.loadImage(imageUrl: String? = null, placeHolder: Drawable? = null) {
    if (imageUrl.isNullOrBlank()) {
        setImageDrawable(placeHolder)
        return
    }
    this.loadImage(imageUrl)
}
