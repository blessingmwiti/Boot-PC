// Generated by view binder compiler. Do not edit!
package com.my.mdmd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.my.mdmd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainscreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button browseButton;

  @NonNull
  public final LinearLayout edittextRow;

  @NonNull
  public final TextInputEditText edittextView;

  @NonNull
  public final CardView infoCardview;

  @NonNull
  public final TextView infoTextview;

  @NonNull
  public final Space space1;

  @NonNull
  public final Button startButton;

  @NonNull
  public final MaterialToolbar topAppBar;

  private FragmentMainscreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button browseButton, @NonNull LinearLayout edittextRow,
      @NonNull TextInputEditText edittextView, @NonNull CardView infoCardview,
      @NonNull TextView infoTextview, @NonNull Space space1, @NonNull Button startButton,
      @NonNull MaterialToolbar topAppBar) {
    this.rootView = rootView;
    this.browseButton = browseButton;
    this.edittextRow = edittextRow;
    this.edittextView = edittextView;
    this.infoCardview = infoCardview;
    this.infoTextview = infoTextview;
    this.space1 = space1;
    this.startButton = startButton;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_mainscreen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainscreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.browse_button;
      Button browseButton = ViewBindings.findChildViewById(rootView, id);
      if (browseButton == null) {
        break missingId;
      }

      id = R.id.edittext_row;
      LinearLayout edittextRow = ViewBindings.findChildViewById(rootView, id);
      if (edittextRow == null) {
        break missingId;
      }

      id = R.id.edittext_view;
      TextInputEditText edittextView = ViewBindings.findChildViewById(rootView, id);
      if (edittextView == null) {
        break missingId;
      }

      id = R.id.info_cardview;
      CardView infoCardview = ViewBindings.findChildViewById(rootView, id);
      if (infoCardview == null) {
        break missingId;
      }

      id = R.id.info_textview;
      TextView infoTextview = ViewBindings.findChildViewById(rootView, id);
      if (infoTextview == null) {
        break missingId;
      }

      id = R.id.space1;
      Space space1 = ViewBindings.findChildViewById(rootView, id);
      if (space1 == null) {
        break missingId;
      }

      id = R.id.start_button;
      Button startButton = ViewBindings.findChildViewById(rootView, id);
      if (startButton == null) {
        break missingId;
      }

      id = R.id.topAppBar;
      MaterialToolbar topAppBar = ViewBindings.findChildViewById(rootView, id);
      if (topAppBar == null) {
        break missingId;
      }

      return new FragmentMainscreenBinding((ConstraintLayout) rootView, browseButton, edittextRow,
          edittextView, infoCardview, infoTextview, space1, startButton, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
