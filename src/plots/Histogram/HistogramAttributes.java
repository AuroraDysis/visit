// ***************************************************************************
//
// Copyright (c) 2000 - 2007, The Regents of the University of California
// Produced at the Lawrence Livermore National Laboratory
// All rights reserved.
//
// This file is part of VisIt. For details, see http://www.llnl.gov/visit/. The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or materials provided with the distribution.
//  - Neither the name of the UC/LLNL nor  the names of its contributors may be
//    used to  endorse or  promote products derived from  this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED.  IN  NO  EVENT  SHALL  THE  REGENTS  OF  THE  UNIVERSITY OF
// CALIFORNIA, THE U.S.  DEPARTMENT  OF  ENERGY OR CONTRIBUTORS BE  LIABLE  FOR
// ANY  DIRECT,  INDIRECT,  INCIDENTAL,  SPECIAL,  EXEMPLARY,  OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit.plots;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;
import llnl.visit.ColorAttribute;

// ****************************************************************************
// Class: HistogramAttributes
//
// Purpose:
//    Attributes for Histogram Plot
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Mon Mar 12 13:13:34 PST 2007
//
// Modifications:
//   
// ****************************************************************************

public class HistogramAttributes extends AttributeSubject implements Plugin
{
    // Enum values
    public final static int OUTPUTTYPE_CURVE = 0;
    public final static int OUTPUTTYPE_BLOCK = 1;

    public final static int TWODAMOUNT_AREA = 0;
    public final static int TWODAMOUNT_REVOLVEDVOLUME = 1;

    public final static int BASEDON_MANYVARSFORSINGLEZONE = 0;
    public final static int BASEDON_MANYZONESFORSINGLEVAR = 1;

    public final static int BINCONTRIBUTION_AUTO = 0;
    public final static int BINCONTRIBUTION_FREQUENCY = 1;
    public final static int BINCONTRIBUTION_WEIGHTED = 2;


    public HistogramAttributes()
    {
        super(14);

        basedOn = BASEDON_MANYZONESFORSINGLEVAR;
        histogramType = BINCONTRIBUTION_AUTO;
        twoDAmount = TWODAMOUNT_REVOLVEDVOLUME;
        specifyRange = false;
        min = 0;
        max = 1;
        numBins = 32;
        domain = 0;
        zone = 0;
        useBinWidths = true;
        outputType = OUTPUTTYPE_BLOCK;
        lineStyle = 0;
        lineWidth = 0;
        color = new ColorAttribute(200, 80, 40);
    }

    public HistogramAttributes(HistogramAttributes obj)
    {
        super(14);

        basedOn = obj.basedOn;
        histogramType = obj.histogramType;
        twoDAmount = obj.twoDAmount;
        specifyRange = obj.specifyRange;
        min = obj.min;
        max = obj.max;
        numBins = obj.numBins;
        domain = obj.domain;
        zone = obj.zone;
        useBinWidths = obj.useBinWidths;
        outputType = obj.outputType;
        lineStyle = obj.lineStyle;
        lineWidth = obj.lineWidth;
        color = new ColorAttribute(obj.color);

        SelectAll();
    }

    public boolean equals(HistogramAttributes obj)
    {
        // Create the return value
        return ((basedOn == obj.basedOn) &&
                (histogramType == obj.histogramType) &&
                (twoDAmount == obj.twoDAmount) &&
                (specifyRange == obj.specifyRange) &&
                (min == obj.min) &&
                (max == obj.max) &&
                (numBins == obj.numBins) &&
                (domain == obj.domain) &&
                (zone == obj.zone) &&
                (useBinWidths == obj.useBinWidths) &&
                (outputType == obj.outputType) &&
                (lineStyle == obj.lineStyle) &&
                (lineWidth == obj.lineWidth) &&
                (color == obj.color));
    }

    public String GetName() { return "Histogram"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetBasedOn(int basedOn_)
    {
        basedOn = basedOn_;
        Select(0);
    }

    public void SetHistogramType(int histogramType_)
    {
        histogramType = histogramType_;
        Select(1);
    }

    public void SetTwoDAmount(int twoDAmount_)
    {
        twoDAmount = twoDAmount_;
        Select(2);
    }

    public void SetSpecifyRange(boolean specifyRange_)
    {
        specifyRange = specifyRange_;
        Select(3);
    }

    public void SetMin(double min_)
    {
        min = min_;
        Select(4);
    }

    public void SetMax(double max_)
    {
        max = max_;
        Select(5);
    }

    public void SetNumBins(int numBins_)
    {
        numBins = numBins_;
        Select(6);
    }

    public void SetDomain(int domain_)
    {
        domain = domain_;
        Select(7);
    }

    public void SetZone(int zone_)
    {
        zone = zone_;
        Select(8);
    }

    public void SetUseBinWidths(boolean useBinWidths_)
    {
        useBinWidths = useBinWidths_;
        Select(9);
    }

    public void SetOutputType(int outputType_)
    {
        outputType = outputType_;
        Select(10);
    }

    public void SetLineStyle(int lineStyle_)
    {
        lineStyle = lineStyle_;
        Select(11);
    }

    public void SetLineWidth(int lineWidth_)
    {
        lineWidth = lineWidth_;
        Select(12);
    }

    public void SetColor(ColorAttribute color_)
    {
        color = color_;
        Select(13);
    }

    // Property getting methods
    public int            GetBasedOn() { return basedOn; }
    public int            GetHistogramType() { return histogramType; }
    public int            GetTwoDAmount() { return twoDAmount; }
    public boolean        GetSpecifyRange() { return specifyRange; }
    public double         GetMin() { return min; }
    public double         GetMax() { return max; }
    public int            GetNumBins() { return numBins; }
    public int            GetDomain() { return domain; }
    public int            GetZone() { return zone; }
    public boolean        GetUseBinWidths() { return useBinWidths; }
    public int            GetOutputType() { return outputType; }
    public int            GetLineStyle() { return lineStyle; }
    public int            GetLineWidth() { return lineWidth; }
    public ColorAttribute GetColor() { return color; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(basedOn);
        if(WriteSelect(1, buf))
            buf.WriteInt(histogramType);
        if(WriteSelect(2, buf))
            buf.WriteInt(twoDAmount);
        if(WriteSelect(3, buf))
            buf.WriteBool(specifyRange);
        if(WriteSelect(4, buf))
            buf.WriteDouble(min);
        if(WriteSelect(5, buf))
            buf.WriteDouble(max);
        if(WriteSelect(6, buf))
            buf.WriteInt(numBins);
        if(WriteSelect(7, buf))
            buf.WriteInt(domain);
        if(WriteSelect(8, buf))
            buf.WriteInt(zone);
        if(WriteSelect(9, buf))
            buf.WriteBool(useBinWidths);
        if(WriteSelect(10, buf))
            buf.WriteInt(outputType);
        if(WriteSelect(11, buf))
            buf.WriteInt(lineStyle);
        if(WriteSelect(12, buf))
            buf.WriteInt(lineWidth);
        if(WriteSelect(13, buf))
            color.Write(buf);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetBasedOn(buf.ReadInt());
                break;
            case 1:
                SetHistogramType(buf.ReadInt());
                break;
            case 2:
                SetTwoDAmount(buf.ReadInt());
                break;
            case 3:
                SetSpecifyRange(buf.ReadBool());
                break;
            case 4:
                SetMin(buf.ReadDouble());
                break;
            case 5:
                SetMax(buf.ReadDouble());
                break;
            case 6:
                SetNumBins(buf.ReadInt());
                break;
            case 7:
                SetDomain(buf.ReadInt());
                break;
            case 8:
                SetZone(buf.ReadInt());
                break;
            case 9:
                SetUseBinWidths(buf.ReadBool());
                break;
            case 10:
                SetOutputType(buf.ReadInt());
                break;
            case 11:
                SetLineStyle(buf.ReadInt());
                break;
            case 12:
                SetLineWidth(buf.ReadInt());
                break;
            case 13:
                color.Read(buf);
                Select(13);
                break;
            }
        }
    }


    // Attributes
    private int            basedOn;
    private int            histogramType;
    private int            twoDAmount;
    private boolean        specifyRange;
    private double         min;
    private double         max;
    private int            numBins;
    private int            domain;
    private int            zone;
    private boolean        useBinWidths;
    private int            outputType;
    private int            lineStyle;
    private int            lineWidth;
    private ColorAttribute color;
}

