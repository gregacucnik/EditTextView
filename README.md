# EditTextView
Android widget combination of ImageView, EditText and TextView.

![Sample Screenshot](https://raw.githubusercontent.com/gregacucnik/EditTextView/master/edittextview.gif)

# Usage
*For a working implementation in the sample app, see the `app/` folder.*

1. Add the dependency in your build.gradle

            compile 'com.gregacucnik:edittextview:1.0'
            
2. Include EditTextView widget in your layout
    
    ```
            <com.gregacucnik.EditTextView
                    android:id="@+id/ettExample"
                    android:layout_width="match_parent"
                    android:layout_height="48dp"
                    app:ettIcon="@drawable/icon_normal"
                    app:ettIconEmpty="@drawable/icon_no_text"
                    app:ettIconInEditMode="@drawable/icon_when_typing"
                    app:ettEmptyTexStyle="normal"
                    app:ettShowHint="false"
                    app:ettEmptyText="Add text&#8230;" />
```

3. (Optional - if you want to exit EditMode when you click outside of EditTextView) Implement OnClickListener for EditTextView parent layout and requestFocus.

    ```
        final LinearLayout llContainer = (LinearLayout)findViewById(R.id.llContainer);
        
        llContainer.setClickable(true);
        llContainer.setFocusable(true);

        llContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llContainer.requestFocus();
            }
        });
```


# Customization

 * `ettIcon` Icon when EditTextView has text
 * `ettIconEmpty` Icon when EditTextView is empty (if not set, ettIcon is used, if set)
 * `ettIconInEditMode` Optional icon when EditTextView is in EditMode (if not set, ettIcon is used, if set)
 * `ettText` EditTextView value
 * `ettEmptyText` Optional hint text to show when ettText is empty
 * `ettEmptyTexStyle` Text Style for Empty Hint Text
 * `ettTextColor` Text color when not empty
 * `ettEmptyColor` Text color for Empty Hint Text
 * `ettSelectAllOnEditMode` Auto-select text when in EditMode
 * `ettShowHint` Show empty hint text when in EditMode
 * `ettIconMarginLeft` Left margin for icon
 * `ettIconMarginRight` Right margin for icon
 * `ettTextMarginLeft` Left margin for Text (Text is to the right of icon)
 * `ettTextMarginRight` Right margin for Text
 * `ettTextSize` Custom text size

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-EditTextView-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/2889)

License
=======
The MIT License (MIT)

Copyright (c) 2015 Grega Čučnik

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
