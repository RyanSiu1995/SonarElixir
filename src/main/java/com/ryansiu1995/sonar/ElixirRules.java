package com.ryansiu1995.sonar;

import com.ryansiu1995.sonar.rules.ElixirRule;
import com.ryansiu1995.sonar.rules.consistency.*;
import com.ryansiu1995.sonar.rules.design.*;
import com.ryansiu1995.sonar.rules.readability.*;
import com.ryansiu1995.sonar.rules.refactor.*;
import com.ryansiu1995.sonar.rules.warning.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.sonar.api.SonarRuntime;
import org.sonar.api.server.rule.RulesDefinition.NewRepository;
import org.sonarsource.analyzer.commons.RuleMetadataLoader;

public class ElixirRules {
    public static final String RESOURCE_FOLDER = "com/ryansiu1995/elixir";
    public static final String DEFAULT_PROFILE_PATH = RESOURCE_FOLDER + "/credo.json";

    public static void addToRepository(NewRepository repository, SonarRuntime sonarRuntime) {
        RuleMetadataLoader ruleMetadataLoader = new RuleMetadataLoader(RESOURCE_FOLDER, DEFAULT_PROFILE_PATH, sonarRuntime);
        ruleMetadataLoader.addRulesByAnnotatedClass(repository, new ArrayList<>(getRuleClass()));
    }

    public static List<Class<? extends ElixirRule>> getRuleClass() {
        return Collections.unmodifiableList(Arrays.asList(
            // Consistency
            ExceptionNames.class,
            LineEndings.class,
            MultipleAliasImportRequireUse.class,
            ParameterPatternMatching.class,
            SpaceAroundOperators.class,
            SpaceInParenthese.class,
            TabOrSpaces.class,
            // Design
            AliasUsage.class,
            DuplicatedCode.class,
            TagFIXME.class,
            TagHelper.class,
            TagTODO.class,
            // Readability
            AliasOrder.class,
            FunctionNames.class,
            LargeNumbers.class,
            MaxLineLength.class,
            ModuleAttributeNames.class,
            ModuleDoc.class,
            ParentheseInCondition.class,
            ParentheseOnZeroArityDefs.class,
            PredicateFunctionNames.class,
            PreferImplicitTry.class,
            PreferUnquotedAtoms.class,
            RedundantBlankLines.class,
            Semicolons.class,
            SinglePipe.class,
            SpaceAfterCommas.class,
            Spec.class,
            StringSigils.class,
            TrailingBlankLine.class,
            TrailingWhiteSpace.class,
            VariableNames.class,
            // Refactor
            ABCSize.class,
            AppendSingleItem.class,
            CaseTrivialMatches.class,
            CondStatements.class,
            CyclomaticComplexity.class,
            DoubleBooleanNegation.class,
            FunctionArity.class,
            LongQuoteBlocks.class,
            MapInto.class,
            MatchInCondition.class,
            ModuleDependencies.class,
            NegatedConditionsInUnless.class,
            NegatedConditionsWithElse.class,
            Nesting.class,
            PerceivedComplexity.class,
            UnlessWithElse.class,
            VariableRebinding.class,
            // Warning
            BoolOperationOnSameValues.class,
            ExpensiveEmptyEnumCheck.class,
            IExPry.class,
            IOInspect.class,
            LazyLogging.class,
            MapGetUnsafePass.class,
            OperationOnSameValues.class,
            OperationWithConstantResult.class,
            RaiseInsideRescue.class,
            UnsafeToAtom.class,
            UnusedEnumOperation.class,
            UnusedFileOperation.class,
            UnusedFunctionReturnHelper.class,
            UnusedKeywordOperation.class,
            UnusedOperation.class,
            UnusedPathOperation.class,
            UnusedRegexOperation.class,
            UnusedStringOperation.class,
            UnusedTupleOperation.class
        ));
    }
}
