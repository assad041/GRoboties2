package com.asd_soft.assaduzzaman_noor.groboties;


import android.support.annotation.NonNull;

import com.google.blockly.android.AbstractBlocklyActivity;
import com.google.blockly.android.codegen.CodeGenerationRequest;
import com.google.blockly.android.codegen.LoggingCodeGeneratorCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic implementation of AbstractBlocklyActivity that demonstrates applying styles. This demo
 * uses an Activity style defined in the manifest XML.
 */
public class StylesActivity extends AbstractBlocklyActivity {
    private static final String TAG = "StylesActivity";

    private static final String SAVE_FILENAME = "styles_workspace.xml";
    private static final String AUTOSAVE_FILENAME = "styles_workspace_temp.xml";

    CodeGenerationRequest.CodeGeneratorCallback mCodeGeneratorCallback =
            new LoggingCodeGeneratorCallback(this, TAG);

    @NonNull
    @Override
    protected List<String> getBlockDefinitionsJsonPaths() {
        return TurtleActivity.TURTLE_BLOCK_DEFINITIONS;
    }

    @NonNull
    @Override
    protected String getToolboxContentsXmlPath() {
        return "turtle/toolbox_advanced.xml";
    }

    @NonNull
    @Override
    protected List<String> getGeneratorsJsPaths() {
        List<String> paths = new ArrayList<String>(1);
        paths.add("turtle/generators.js");
        return paths;
    }

    @NonNull
    @Override
    protected CodeGenerationRequest.CodeGeneratorCallback getCodeGenerationCallback() {
        // Uses the same callback for every generation call.
        return mCodeGeneratorCallback;
    }

    @Override
    @NonNull
    protected String getWorkspaceSavePath() {
        return SAVE_FILENAME;
    }

    @Override
    @NonNull
    protected String getWorkspaceAutosavePath() {
        return AUTOSAVE_FILENAME;
    }
}
