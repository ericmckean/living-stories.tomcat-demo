/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS-IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.livingstories.client.lsp.views.contentitems;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.livingstories.client.AssetContentItem;

/**
 * Extends ImageAssetPreview to add a 'Graphic' header.
 */
public class GraphicAssetPreview extends ImageAssetPreview {
  private static GraphicAssetPreviewUiBinder uiBinder =
      GWT.create(GraphicAssetPreviewUiBinder.class);
  interface GraphicAssetPreviewUiBinder extends UiBinder<Widget, GraphicAssetPreview> {
  }

  public GraphicAssetPreview(AssetContentItem contentItem) {
    super(contentItem);
  }

  @Override
  protected void bind() {
    initWidget(uiBinder.createAndBindUi(this));
  }
}
