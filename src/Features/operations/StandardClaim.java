/*
 * The MIT License
 * 
 * Copyright (c) 2018 FuturICT 2.0
 * 
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Features.operations;

import Features.operations.actions.IAction;


/**
 *
 * @author Mark C. Ballandies <bmark@ethz.ch>
 */
public class StandardClaim implements IClaim{

    
    IAction action;
    IProof proof;

    public StandardClaim(IAction action, IProof proof) {
        this.action = action;
        this.proof = proof;
    }
    
    
    
    @Override
    public IAction getAction() {
       return this.action;
    }

    @Override
    public IProof getProof() {
        return this.proof;
    }
    
    
    
}
