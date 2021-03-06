⚠️ *This repository is no longer active. Together with other strands of work it is further pursued here: [FIN4XPLORER](https://github.com/FuturICT2/FIN4XPLORER)*

<hr>

# Genesis Library

Java library to create Tokens with different Properties, Underlyings and Operations.

* Properties: inherent characters of a token. I.e. name, symbol, token cap etc.
* Underlyings: Gives value to the token. Is the token backed up by a commodity, service (i.e. storage), etc.
* Operations: Actions which can be performed with the token. I.e. a transaction of value. Another example is the incentivization of a behavior. I.e. new token is mined for planting trees

The project is written with the netbeans IDE.

The library is motivated by the conceputal architecture found in [ here ](https://arxiv.org/pdf/1811.03419.pdf). This document is in particular interesting for those who want to obtain a deeper understanding of distributed ledger technology systems. 

An example project exists, which uses this library. It is called GenesisApp: www.github.com/FuturICT2/GenesisApp. In case of questions, please contact: bmark@ethz.ch.

## Software Architecture (little bit outdated) for the BIOTS Challenge 2018 

* Challenge 1: replace the SQLlite repository (of the GenesisApp project, the other repository :)) with ad blockchain technology
* Challenge 2: extend the Operation interfaces

Check the other repository for detailed information on the challenges.

![alt text](https://github.com/FuturICT2/Genesis/blob/master/toolUml.png)
