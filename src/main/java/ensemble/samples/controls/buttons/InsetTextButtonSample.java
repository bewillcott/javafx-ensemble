/*
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ensemble.samples.controls.buttons;

import ensemble.Sample;
import javafx.geometry.Insets;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;

/**
 * A sample that shows use of CSS to style inset text in a button.
 * 
 * @see Insets
 * @see ButtonBuilder
 * @resource InsetTextButton.css
 *
 */
public class InsetTextButtonSample extends Sample {

    public InsetTextButtonSample() {

        String insetTextCss = InsetTextButtonSample.class.getResource("InsetTextButton.css").toExternalForm();
        VBox vbox = VBoxBuilder.create().id("insettextvbox").spacing(10).padding(new Insets(10)).children(
                ButtonBuilder.create().text("Inset Text Button").id("button1").build(),
                ButtonBuilder.create().text("Plain Text Button").id("button2").build()).build();

        vbox.getStylesheets().add(insetTextCss);
        getChildren().add(vbox);
    }
}

