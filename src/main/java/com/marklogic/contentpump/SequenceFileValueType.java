/*
 * Copyright 2003-2014 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.contentpump;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import com.marklogic.mapreduce.MarkLogicNode;

/**
 * Enum for SequenceFile value types.
 * @author ali
 *
 */
public enum SequenceFileValueType {
    MARKLOGICNODE {
        @Override
        public Class<? extends Writable> getWritableClass() {
            return MarkLogicNode.class;
        }
    },
    TEXT {
        @Override
        public Class<? extends Writable> getWritableClass() {
            return Text.class;
        }
    },
    BYTESWRITABLE {
        @Override
        public Class<? extends Writable> getWritableClass() {
            return BytesWritable.class;
        }
    };
    public abstract Class<? extends Writable> getWritableClass();
}
