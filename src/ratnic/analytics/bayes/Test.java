/*******************************************************************************
 *        File: Test.java
 *      Author: Morteza Ansarinia <morteza@ratnic.se>
 *    Revision: 8
 * Description: Test naive bayes classifier for Farsi language.
 *  Created on: December 14, 2012
 *     Project: ratnic.analytics
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/

package ratnic.analytics.bayes;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        /*
         * Create a new classifier instance. The context features are
         * Strings and the context will be classified with a String according
         * to the featureset of the context.
         */
        final Classifier<String, String> bayes = new BayesClassifier<String, String>();

        /*
         * The classifier can learn from classifications that are handed over
         * to the learn methods. Imagin a tokenized text as follows. The tokens
         * are the text's features. The category of the text will either be
         * positive or negative.
         */
        final String[] positiveText = "هوای آفتابی و زیبا و خوب باعث موفقیت میشود.".split("\\s");
        bayes.learn("positive", Arrays.asList(positiveText));

        final String[] negativeText = "بدترین زشت کثافت تیره بد".split("\\s");
        bayes.learn("negative", Arrays.asList(negativeText));

        final String[] neutralText = "دنیای معمولی و عادی و بی خیال".split("\\s");
        bayes.learn("neutral", Arrays.asList(neutralText));

        /*
         * Now that the classifier has "learned" two classifications, it will
         * be able to classify similar sentences. The classify method returns
         * a Classification Object, that contains the given featureset,
         * classification probability and resulting category.
         */
        final String[] unknownText1 = "روز خوب و زیبا و موفق داشته باشی".split("\\s");
        final String[] unknownText2 = "معمولی باشی".split("\\s");
        final String[] unknownText3 = "بدترین روز و زشت ترین خاطره را داشته باشی".split("\\s");

        System.out.println( // will output "positive"
                bayes.classify(Arrays.asList(unknownText1)));
        System.out.println( // will output "neutral"
                bayes.classify(Arrays.asList(unknownText2)));
        System.out.println( // will output "negative"
                bayes.classify(Arrays.asList(unknownText3)));

        /*
         * The BayesClassifier extends the abstract Classifier and provides
         * detailed classification results that can be retrieved by calling
         * the classifyDetailed Method.
         *
         * The classification with the highest probability is the resulting
         * classification. The returned List will look like this.
         * [
         *   Classification [
         *     category=negative,
         *     probability=0.0078125,
         *     featureset=[today, is, a, sunny, day]
         *   ],
         *   Classification [
         *     category=positive,
         *     probability=0.0234375,
         *     featureset=[today, is, a, sunny, day]
         *   ]
         * ]
         */
        ((BayesClassifier<String, String>) bayes).classifyDetailed(
                Arrays.asList(unknownText1));

        /*
         * Please note, that this particular classifier implementation will
         * "forget" learned classifications after a few learning sessions. The
         * number of learning sessions it will record can be set as follows:
         */
        bayes.setMemoryCapacity(500); // remember the last 500 learned classifications
    }

}
