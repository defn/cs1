# cs1

Minimal ClojureScript project using JavaScript libraries

## Overview

Customizing a ClojureScript project is frustrating because it's not
clear how ClojureScript fits with other JavaScript tools.  For
non-Clojure users, it's easier to use JavaScript tools.

cs1 is an attempt to treat ClojureScript as just another JavaScript
tool that fits with other tools like WebPack, npm, etc.

## Setup

Most of the following scripts require [rlwrap](http://utopia.knoware.nl/~hlub/uck/rlwrap/) (on OS X installable via brew).

Build your project once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

To auto build your project in dev mode:

    ./script/watch

To start an auto-building Node REPL:

    ./scripts/repl

To get source map support in the Node REPL:

    lein npm install
    
To start a browser REPL:
    
1. Run `./scripts/brepl`
2. Browse to `http://localhost:9000` (you should see `Hello world!` in the web console)
3. (back to step 1) you should now see the REPL prompt: `cljs.user=>`
5. You may now evaluate ClojureScript statements in the browser context.
    
For more info using the browser as a REPL environment, see
[this](https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments#browser-as-evaluation-environment).
    
Clean project specific out:

    lein clean
     
Build a single release artifact with the following script and then open `index_release.html` in your browser.

    ./scripts/release

Generate documentation:

    lein marg

Then open `docs/uberdoc.html`

## License

Copyright © 2015 

Distributed under the Apache License version 2.0.
