package com.asd_soft.assaduzzaman_noor.groboties;


import android.support.annotation.NonNull;

import com.google.blockly.android.AbstractBlocklyActivity;
import com.google.blockly.android.codegen.CodeGenerationRequest;
import com.google.blockly.android.codegen.LoggingCodeGeneratorCallback;
import com.google.blockly.model.DefaultBlocks;

import java.util.Arrays;
import java.util.List;

/**
 * Simplest implementation of AbstractBlocklyActivity.
 */
public class SimpleActivity extends AbstractBlocklyActivity {
    private static final String TAG = "SimpleActivity";

    private static final String SAVE_FILENAME = "simple_workspace.xml";
    private static final String AUTOSAVE_FILENAME = "simple_workspace_temp.xml";

    // Add custom blocks to this list.
    private static final List<String> BLOCK_DEFINITIONS = DefaultBlocks.getAllBlockDefinitions();
    private static final List<String> JAVASCRIPT_GENERATORS = Arrays.asList(
        // Custom block generators go here. Default blocks are already included.
        // TODO(#99): Include Javascript defaults when other languages are supported.
    );

    CodeGenerationRequest.CodeGeneratorCallback mCodeGeneratorCallback =
            new LoggingCodeGeneratorCallback(this, TAG);

    @NonNull
    @Override
    protected List<String> getBlockDefinitionsJsonPaths() {
        return BLOCK_DEFINITIONS;
    }

    @NonNull
    @Override
    protected String getToolboxContentsXmlPath() {
        // Replace with a toolbox that includes application specific blocks.
        return DefaultBlocks.TOOLBOX_PATH;
    }

    @NonNull
    @Override
    protected List<String> getGeneratorsJsPaths() {
        return JAVASCRIPT_GENERATORS;
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
