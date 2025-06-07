/*******************************************************************************
 * This file is part of RedReader.
 *
 * RedReader is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RedReader is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RedReader.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package org.quantumbadger.redreader.common;

import android.content.Context;
import android.content.res.TypedArray;

import org.quantumbadger.redreader.R;

import java.util.EnumSet;

public class RRThemeAttributes {

	public final int rrCommentHeaderBoldCol;
	public final int rrCommentHeaderAuthorCol;
	public final int rrCommentHeaderScoreCol;
	public final int rrCommentHeaderAgeCol;
	public final int rrCommentHeaderSubredditCol;
	public final int rrCommentHeaderControversialityCol;
	public final int rrPostSubtitleUpvoteCol;
	public final int rrPostSubtitleDownvoteCol;
	public final int rrPostSubtitleAuthorCol;
	public final int rrPostSubtitleSubredditCol;
	public final int rrPostSubtitleAgeCol;
	public final int rrPostSubtitleCommentsCol;
	public final int rrFlairBackCol;
	public final int rrFlairTextCol;
	public final int rrGoldBackCol;
	public final int rrGoldTextCol;
	public final int rrCommentHeaderCol;
	public final int rrCommentBodyCol;
	public final int rrMainTextCol;
	public final int colorAccent;
	public final int rrCrosspostBackCol;
	public final int rrCrosspostTextCol;

	public final int rrIndentLineCol1;
	public final int rrIndentLineCol2;
	public final int rrIndentLineCol3;
	public final int rrIndentLineCol4;
	public final int rrIndentLineCol5;

	private final EnumSet<PrefsUtility.AppearanceCommentHeaderItem> mCommentHeaderItems;

	public final float rrCommentFontScale;
	public final float rrCommentHeaderFontScale;

	public RRThemeAttributes(final Context context) {

		final TypedArray appearance = context.obtainStyledAttributes(new int[] {
				R.attr.rrCommentHeaderBoldCol,
				R.attr.rrCommentHeaderAuthorCol,
				R.attr.rrCommentHeaderScoreCol,
				R.attr.rrCommentHeaderAgeCol,
				R.attr.rrCommentHeaderSubredditCol,
				R.attr.rrCommentHeaderControversialityCol,
				R.attr.rrPostSubtitleUpvoteCol,
				R.attr.rrPostSubtitleDownvoteCol,
				R.attr.rrPostSubtitleAuthorCol,
				R.attr.rrPostSubtitleSubredditCol,
				R.attr.rrPostSubtitleAgeCol,
				R.attr.rrPostSubtitleCommentsCol,
				R.attr.rrFlairBackCol,
				R.attr.rrFlairTextCol,
				R.attr.rrGoldBackCol,
				R.attr.rrGoldTextCol,
				R.attr.rrCommentHeaderCol,
				R.attr.rrCommentBodyCol,
				R.attr.rrMainTextCol,
				com.google.android.material.R.attr.colorAccent,
				R.attr.rrCrosspostBackCol,
				R.attr.rrCrosspostTextCol,
				R.attr.rrIndentLineCol1,
				R.attr.rrIndentLineCol2,
				R.attr.rrIndentLineCol3,
				R.attr.rrIndentLineCol4,
				R.attr.rrIndentLineCol5
		});

		rrCommentHeaderBoldCol = appearance.getColor(0, 255);
		rrCommentHeaderAuthorCol = appearance.getColor(1, 255);
		rrCommentHeaderScoreCol = appearance.getColor(2, 255);
		rrCommentHeaderAgeCol = appearance.getColor(3, 255);
		rrCommentHeaderSubredditCol = appearance.getColor(4, 255);
		rrCommentHeaderControversialityCol = appearance.getColor(5, 255);
		rrPostSubtitleUpvoteCol = appearance.getColor(6, 255);
		rrPostSubtitleDownvoteCol = appearance.getColor(7, 255);
		rrPostSubtitleAuthorCol = appearance.getColor(8, 255);
		rrPostSubtitleSubredditCol = appearance.getColor(9, 255);
		rrPostSubtitleAgeCol = appearance.getColor(10, 255);
		rrPostSubtitleCommentsCol = appearance.getColor(11, 255);
		rrFlairBackCol = appearance.getColor(12, 0);
		rrFlairTextCol = appearance.getColor(13, 255);
		rrGoldBackCol = appearance.getColor(14, 0);
		rrGoldTextCol = appearance.getColor(15, 255);
		rrCommentHeaderCol = appearance.getColor(16, 255);
		rrCommentBodyCol = appearance.getColor(17, 255);
		rrMainTextCol = appearance.getColor(18, 255);
		colorAccent = appearance.getColor(19, 255);
		rrCrosspostBackCol = appearance.getColor(20, 255);
		rrCrosspostTextCol = appearance.getColor(21, 255);
		rrIndentLineCol1 = appearance.getColor(22, 0xFF6B8AC7); // Blue fallback
		rrIndentLineCol2 = appearance.getColor(23, 0xFF5FA05F); // Green fallback
		rrIndentLineCol3 = appearance.getColor(24, 0xFFCD8500); // Orange fallback
		rrIndentLineCol4 = appearance.getColor(25, 0xFFB8374A); // Red fallback
		rrIndentLineCol5 = appearance.getColor(26, 0xFF8E6FB8); // Purple fallback

		appearance.recycle();

		mCommentHeaderItems = PrefsUtility.appearance_comment_header_items();

		rrCommentFontScale = PrefsUtility.appearance_fontscale_bodytext();
		rrCommentHeaderFontScale = PrefsUtility.appearance_fontscale_comment_headers();
	}

	public boolean shouldShow(final PrefsUtility.AppearanceCommentHeaderItem type) {
		return mCommentHeaderItems.contains(type);
	}
}
